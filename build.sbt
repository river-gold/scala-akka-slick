name := "beliar"

version := "1.0"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.14"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-experimental_2.11
libraryDependencies += "com.typesafe.akka" % "akka-http-experimental_2.11" % "2.4.11"

// https://mvnrepository.com/artifact/com.typesafe.slick/slick_2.11
libraryDependencies += "com.typesafe.slick" % "slick_2.11" % "3.1.1"

// https://mvnrepository.com/artifact/com.h2database/h2
libraryDependencies += "com.h2database" % "h2" % "1.4.193"

// https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.6.4"
