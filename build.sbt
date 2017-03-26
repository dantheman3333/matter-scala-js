enablePlugins(ScalaJSPlugin)

name := "matter-scala-js"

version := "1.0"

organization := "com.github.kramer425"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "org.querki" %%% "querki-jsext" % "0.8"
)