//> using test.dep org.scalameta::munit::1.0.0
//> using file 1.asserts.scala

class Asserts extends munit.FunSuite {
  test("assert True") {
    assert(assertTrue == true)
  }

  test("assert Equals") {
    assert(v4 == 4)
    assert(assertEquals = true)

  }

  test("assert 1 + 1") {
    assert(v2 == 2)
    assert(assertEquation == true)
  }
}
