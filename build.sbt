import org.scalajs.linker.interface.ModuleInitializer

name := """lokallykke-client"""
organization := "lokallykke.dk"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.5"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)


libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

scalaJSModuleInitializers in Compile += {
  ModuleInitializer.mainMethod("dk.lokallykke.client.accounting.Accounting", "main").withModuleID("accounting")
}