


scalaVersion := "2.12.10"
name := "Iliad 23"

licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))
resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",

  "edu.holycross.shot.cite" %% "xcite" % "4.3.0",
  "edu.holycross.shot" %% "scm" % "7.2.0",
  "edu.holycross.shot" %% "ohco2" % "10.18.2",
  "edu.holycross.shot" %% "citeobj" % "7.4.0",
  "edu.holycross.shot" %% "cex" % "6.4.0",
  "edu.holycross.shot" %% "midvalidator" % "12.2.2",

  "org.homermultitext" %% "hmt-textmodel" % "6.0.1",

  //"edu.holycross.shot" %% "latphone" % "2.7.2",
  //"edu.holycross.shot.mid" %% "latin-text-model" % "1.3.0"

)
