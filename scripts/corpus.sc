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

val corpus = loadLibrary.textRepository.get.corpus
