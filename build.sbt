name := """lokallykke-client"""
organization := "lokallykke.dk"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)

scalaVersion := "2.13.5"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

scalaJSUseMainModuleInitializer := true

mainClass := Some("dk.lokallykke.client.Main")