import sbt._
import Keys._
import Dependencies._

object Core {
  lazy val core = (project in file("core"))
    .settings(Base.settings)
    .settings(
      name := "$name$-core",
      scalacOptions ++= Base.commonScalaOptions,
      libraryDependencies ++= Base.commonLibs
    )
}
