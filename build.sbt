name := "CassieTest"

version := "0.1"

scalaVersion := "2.8.1"

resolvers :=Seq( "Twitter's Repository" at "http://maven.twttr.com/",
             "Typesafe repo" at  "http://repo.typesafe.com/typesafe/repo",
             "Sonatype's Repo" at "https://oss.sonatype.org/content/groups/public/"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.8.1" % "1.8" intransitive(),
  "com.twitter" % "cassie" % "0.20.0"
  	exclude("com.sun.jmx","jmxri")
  	exclude("javax.jms","jms")
  	exclude("com.sun.jdmk","jmxtools")
)
