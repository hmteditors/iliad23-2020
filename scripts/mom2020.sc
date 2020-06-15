
import edu.holycross.shot.cite._


import edu.holycross.shot.mid.validator._
import edu.holycross.shot.citevalidator._
import edu.holycross.shot.mid.markupreader._
import edu.holycross.shot.cite._
import edu.holycross.shot.scm._


def readersMap : Map[String, Vector[MidMarkupReader]] = Map(
  "DiplomaticReader" ->   Vector(MidProseABDiplomatic)
)
val repo = EditorsRepo(".", readersMap)
val dseValidator = DseValidator(repo.library)
