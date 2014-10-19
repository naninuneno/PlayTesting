import play.Project._

name := "testproj"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(
  jdbc,
  anorm
)

libraryDependencies += "postgresql" % "postgresql" % "8.4-702.jdbc4"