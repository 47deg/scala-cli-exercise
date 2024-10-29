package com.xebia.stdlib

// Scala tuple combines a fixed number of items together so that they can be passed around as a whole. They are one-indexed. Unlike an array or list, a tuple can hold objects with different types but they are also immutable. Here is an example of a tuple holding an integer, a string, and the console:

// val t = (1, "hello", Console)
// Which is syntactic sugar (short cut) for the following:

// val t = new Tuple3(1, "hello", Console)
// As you can see, tuples can be created easily:

val tuple = ("apple", "dog")
val fruit = tuple._1
// test: String = "apple"

val animal = tuple._2
// test: String = "dog"

// Tuples may be of mixed type:

class Date()

val tuple5 = ("a", 1, 2.2, new Date(), "five")

val typle52 = tuple5._2
// test: Int = 1

val tuple55 = tuple5._5
// test: String = "five"

// You can assign multiple variables at once using tuples:

val student = ("Sean Rogers", 21, 3.5)
val (name, age, gpa) = student

// The swap method can be used to swap the elements of a Tuple2:

val tuple2 = ("apple", 3).swap

val tuple21 = tuple2._1
// test: Int = 3

val tuple22 = tuple2._2
// test: String = "apple"
