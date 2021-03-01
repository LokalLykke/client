import org.scalajs.linker.interface.ModuleInitializer

name := """lokallykke-client"""
organization := "lokallykke.dk"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.5"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)


libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.1.0"
)

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %%% "circe-core",
  "io.circe" %%% "circe-generic",
  "io.circe" %%% "circe-parser"
).map(_ % circeVersion)

scalaJSModuleInitializers in Compile += {
  ModuleInitializer.mainMethod("dk.lokallykke.client.accounting.Accounting", "main").withModuleID("accounting")
}