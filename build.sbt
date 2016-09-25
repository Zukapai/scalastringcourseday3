name := "scala string course day 3"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-encoding", "UTF-8")

javacOptions ++= Seq("-encoding", "UTF-8")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5" withSources() withJavadoc(),
  "junit" % "junit" % "4.12" % Test withSources() withJavadoc(),
  "com.novocode" % "junit-interface" % "0.11" % Test withSources() withJavadoc(),
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % Test withSources() withJavadoc(),
  "net.ceedubs" % "ficus_2.11" % "1.1.2" withSources() withJavadoc()
)