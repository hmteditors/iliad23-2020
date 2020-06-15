
import edu.holycross.shot.cite._
import edu.holycross.shot.mid.validator._
import edu.holycross.shot.citevalidator._
import edu.holycross.shot.mid.markupreader._
import edu.holycross.shot.cite._
import edu.holycross.shot.scm._
import org.homermultitext.edmodel._

def readersMap : Map[String, Vector[MidMarkupReader]] = Map(
  "DiplomaticReader" ->   Vector(MidDiplomaticEdition)
)
val repo = EditorsRepo(".", readersMap)
val dseValidator = DseValidator(repo.library)
