
import edu.holycross.shot.mid.validator._
import edu.holycross.shot.citevalidator._
import edu.holycross.shot.mid.markupreader._
import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.scm._
import org.homermultitext.edmodel._



def readersMap : Map[String, Vector[MidMarkupReader]] = Map(
  "DiplomaticReader" ->   Vector(DiplomaticReader)
)

def loadLibrary: CiteLibrary =  {
  EditorsRepo(".", readersMap).library
}


// Validate one page
def validate(page: String) : Unit = {
  val pgUrn = Cite2Urn(page)
  val dseValidator = DseValidator(loadLibrary)
}

// Tell them how to use the script.
def usage: Unit = {
  println("\n\nTo validate a page:\n\tvalidate(\"PAGE_URN\")\n")
  println("Example:\n\tvalidate(\"urn:cite2:hmt:msB.v1:303v\")\n")
  println("Results will be written as markdown files in the `validation` directory.")
}

usage
