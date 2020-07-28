// Load all current texts in this repo as a Corpus.


import edu.holycross.shot.mid.validator._
import edu.holycross.shot.mid.markupreader._
import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.scm._
import org.homermultitext.edmodel._


def readersMap : Map[String, Vector[MidMarkupReader]] = Map(
  "DiplomaticReader" ->   Vector(DiplomaticReader)
)
// Create a library object from a repository with
// directories organized according to MID conventions.
def loadLibrary: CiteLibrary =  {
  EditorsRepo(".", readersMap).library
}

val rawCorpus = loadLibrary.textRepository.get.corpus

def scholia : Corpus =  {
  val schol = rawCorpus ~~ CtsUrn("urn:cts:greekLit:tlg5026:")
  val noReff = schol.nodes.filterNot(n => n.urn.passageComponent.endsWith("ref"))
  Corpus(noReff)
}

def iliad : Corpus = {
  rawCorpus ~~ CtsUrn("urn:cts:greekLit:tlg0012.tlg001:")
}

val corpus = iliad ++ scholia

def info = {
  println("\n\nAll the texts in this repository are now loaded in a citable corpus.\n")
  println("To see examples of some things you can do, run:\n")
  println("\texamples")
  println("\nTo write all texts in this repository to a file in CEX format:\n")
  println("\twriteCorpus(FILENAME)")
}

def examples = {
  val eg = """

EXAMPLES OF USING A CITABLE CORPUS

1. The twiddle method `~~` creates a new corpus with "matching" URN values.

- Create a corpus containing all your *Iliad* texts:

    val iliads = corpus ~~ CtsUrn("urn:cts:greekLit:tlg0012.tlg001:")

- Create a corpus containing only the Venetus B: *Iliad*:

    val vb = corpus ~~ CtsUrn("urn:cts:greekLit:tlg0012.tlg001.msB:")


2. A corpus has a Vector of citable nodes.

- See how many nodes are in your corpus:

    corpus.nodes.size

- Use the Vector of nodes to create a Vector of passage references:

    vb.nodes.map(cnode => cnode.urn.passageComponent)

- Use the Vector of nodes to create a single massive String and split it on white space.
You can even show off and do it in a single line!

    val vbwords = vb.nodes.map(cnode => cnode.text).
    mkString("\n").split("[\\s]")


"""
  println(eg)
}

import java.io.PrintWriter
def writeCorpus(f: String = "iliad23-corpus.cex") = {
  new PrintWriter(f){write(corpus.cex());close;}
  println("CEX file for all texts written to " + f)
}

info
