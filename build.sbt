name := "mallet"

version := "2.0.7"

fork := true

// jboss repo
resolvers += "opennlp.sourceforge.net" at "http://opennlp.sourceforge.net/maven2"

// Apache snapshots
resolvers += "repo.scalanlp.org" at "http://repo.scalanlp.org/repo"

// Trove
resolvers += "maven.ontotext.com" at "http://maven.ontotext.com/archiva/repository/public"

libraryDependencies ++= Seq(
  "net.sf.trove4j" % "trove4j" % "3.0.3",
  "junit" % "junit" % "4.8.2",
  "bsh" % "bsh" % "2.0b4",
  "jgrapht" % "jgrapht" % "0.6.0",
  "net.sf.jwordnet" % "jwnl" % "1.3.3",
  "com.googlecode.matrix-toolkits-java" % "mtj" % "0.9.14",
  "org.jdom" % "jdom" % "1.1"
)
