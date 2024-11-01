package com.xebia.stdlib

// Classes in Scala are static templates that can be instantiated into many objects at runtime. Here is a class definition which defines a class Point:

// class Point(x: Int, y: Int) {
//   override def toString(): String = "(" + x + ", " + y + ")"
// }
// The class defines two variables x and y and one method toString.

// Classes in Scala are parameterized with constructor arguments. The code above defines two constructor arguments, x and y; they are both visible in the whole body of the class. In our example they are used to implement toString.

// Classes are instantiated with the new primitive, as the following example will show:

// object Classes {
//   def main(args: Array[String]) = {
//     val pt = new Point(1, 2)
//     println(pt)
//   }
// }
// The program defines an executable application Classes in the form of a top-level singleton object with a main method. The main method creates a new Point and stores it in value pt.

// This also demonstrates the use of value parameters in ClassWithValParameter(val name: String), which automatically creates an internal property val name: String in the class:

class ClassWithValParameter(val name: String)
val aClass = new ClassWithValParameter("Gandalf")

val aClassName = aClass.name
// test: String = "Gandlaf"
