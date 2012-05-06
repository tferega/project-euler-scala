organization := "com.ferega"

name := "pe"

version := "0.0.1"

scalaVersion := "2.9.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "UTF-8", "-optimise")

initialCommands := "import com.ferega.pe._"

unmanagedSourceDirectories in Compile <<= (scalaSource in Compile)(_ :: Nil)

unmanagedSourceDirectories in Test := Nil

crossPaths       := false

resolvers := Seq(
)

externalResolvers <<= resolvers map { rs =>
  Resolver.withDefaultResolvers(rs, mavenCentral = false, scalaTools = false)
}

libraryDependencies ++= Seq(
)
