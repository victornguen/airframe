Global / onChangedBuildSource := ReloadOnSourceChanges

val AIRFRAME_VERSION = "24.7.0"
ThisBuild / scalaVersion := "2.13.14"

lazy val gallery =
  project
    .enablePlugins(ScalaJSPlugin)
    .in(file("."))
    .settings(
      scalaJSUseMainModuleInitializer := false,
      scalacOptions ++= Seq(
        // Necessary for tracking source code range in airframe-rx demo
        "-Yrangepos"
      ),
      libraryDependencies ++= Seq(
        "org.wvlet.airframe" %%% "airframe-rx-html" % AIRFRAME_VERSION
      )
    )
