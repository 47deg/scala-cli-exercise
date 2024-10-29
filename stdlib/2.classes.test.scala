//> using files "2.classes.scala"
//> using test.dependency "org.scalameta::munit::1.0.1"

class Classes extends munit.FunSuite {
  test("internal class property") {
    assert(aClassName == "Gandalf")
  }
}
