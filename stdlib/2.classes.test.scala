//> using test.dep org.scalameta::munit::1.0.1
//> using file 2.classes.scala

class Classes extends munit.FunSuite {
  test("internal class property") {
    assert(aClassName == "Gandalf")
  }
 }
