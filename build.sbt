name := "CassieTest"

version := "0.1"

scalaVersion := "2.9.2"

resolvers += "Twitter's Repository" at "http://maven.twttr.com/"
//resolvers += "Sonatype's Repo" at "https://oss.sonatype.org/content/groups/public/"

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-ostrich" % "1.9.0"
 	exclude("com.sun.jmx","jmxri")
        exclude("javax.jms","jms")
        exclude("com.sun.jdmk","jmxtools"),
  "com.twitter" % "finagle-core_2.9.1" % "1.11.1"
 	exclude("com.sun.jmx","jmxri")
        exclude("javax.jms","jms")
        exclude("com.sun.jdmk","jmxtools"),
  "com.twitter" % "util" % "1.12.12"
	exclude("com.sun.jmx","jmxri")
  	exclude("javax.jms","jms")
  	exclude("com.sun.jdmk","jmxtools"),
//	exclude("com.twitter","finagle-core"),
  "com.twitter" % "cassie-core" % "0.25.3",
//	 exclude("com.twitter","finagle-core"),
  "org.scalatest" % "scalatest" % "1.9.1" % "test",
  "com.twitter" % "cassie" % "0.19.0"
  	exclude("com.sun.jmx","jmxri")
  	exclude("javax.jms","jms")
  	exclude("com.sun.jdmk","jmxtools")
//	 exclude("com.twitter","finagle-core")
)

