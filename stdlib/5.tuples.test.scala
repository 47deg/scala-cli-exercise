//> using test.dep org.scalameta::munit::1.0.1
//> using file 5.tuples.scala

class Tuples extends munit.FunSuite {
  test("tuple values") {
    assert(fruit == "apple")
    assert(animal == "dog")
  }
  test("tuple mixed types") {
    assert(typle52 == 1)
    assert(tuple55 == "five")
  }
  test("tuple swap") {
    assert(tuple21 == 3)
    assert(tuple22 == "apple")
  }
 }
