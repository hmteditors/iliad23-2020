


scalaVersion := "2.12.10"
name := "Iliad 23"

licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))
resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",

  "edu.holycross.shot.cite" %% "xcite" % "4.3.0",
  "edu.holycross.shot" %% "scm" % "7.3.0",
  "edu.holycross.shot" %% "ohco2" % "10.19.0",
  "edu.holycross.shot" %% "citeobj" % "7.5.0",
  "edu.holycross.shot" %% "cex" % "6.5.0",
  "edu.holycross.shot" %% "midvalidator" % "13.0.0",
  "edu.holycross.shot" %% "citevalidator" % "1.2.0",

  "org.homermultitext" %% "hmt-textmodel" % "7.0.0",



)
