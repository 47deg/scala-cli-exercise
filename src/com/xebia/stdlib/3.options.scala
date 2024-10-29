package com.xebia.stdlib

// If you have worked with Java at all in the past, it is very likely that you have come across a NullPointerException at some time (other languages will throw similarly named errors in such a case). Usually this happens because some method returns null when you were not expecting it and thus not dealing with that possibility in your client code. A value of null is often abused to represent an absent optional value.

// Scala tries to solve the problem by getting rid of null values altogether and providing its own type for representing optional values, i.e. values that may be present or not: the Option[A] trait.

// Option[A] is a container for an optional value of type A. If the value of type A is present, the Option[A] is an instance of Some[A], containing the present value of type A. If the value is absent, the Option[A] is the object None.

val someValue: Option[String] = Some("I am wrapped in something")
// test: Option[String] = Some("I am wrapped in something")

val emptyValue: Option[String] = None
// test: Option[String] = None

// Let's write a function that may or not give us a string, thus returning Option[String]:

def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}
// Using getOrElse, we can extract the value if it exists, or return a provided default value. If we have a Some(x) we return x, and for None we return the default value.

val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)

val value1Get = value1 getOrElse "No value"
// test: String = "Found value"

val value2Get = value2 getOrElse "No value"
// test: String = "No value"

val value2GetFunction = value2 getOrElse "default function"
// test: String = "default function"

// Checking whether option has value:

val value1IsEmpty = value1.isEmpty
// test: Boolean = false
val value2IsEmpty = value2.isEmpty
// test: Boolean = true

// Option can also be used with pattern matching:

val someDoubleValue: Option[Double] = Some(20.0)
val someValueMatch = someDoubleValue match
  case Some(v) => v
  case None    => 0.0
// test: Double = 20.0

val noValue: Option[Double] = None
val noValueMatch = noValue match
  case Some(v) => v
  case None    => 0.0
// test: Double = 0.0

// An alternative for pattern matching is performing collection style operations. This is possible because an option could be looked at as a collection with either one or zero elements.

// One of these operations is map. This operation allows us to map the inner value to a different type while preserving the option:

val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val numberMap = number.map(_ * 1.5)
// test: Option[Double] = Some(4.5)

val noNumberMap = noNumber.map(_ * 1.5)
// test: Option[Double] = None

// Another operation is fold. This operation will extract the value from the option, or provide a default if the value is None

val numberFold = number.fold(1)(_ * 3)
// test: Int: 9

val noNumberFold = noNumber.fold(1)(_ * 3)
// test: Int 1
