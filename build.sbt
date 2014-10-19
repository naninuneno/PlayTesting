import play.Project._

name := "testproj"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(
  jdbc,
  anorm
)

val appDependencies = Seq(
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)