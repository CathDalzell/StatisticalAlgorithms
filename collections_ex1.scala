// Exercises about Scala collections

/* We can get an array of type File and work with it */

val a = new java.io.File(".").listFiles

a.foreach(x => println(x.toString))
