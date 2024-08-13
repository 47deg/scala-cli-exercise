
// An object is a singleton. One object, that's it. This object is a replacement of static in Java, and is called upon much in the same way:

object Greeting:
  def english = "Hi"
  def espanol = "Hola"

val greetingEnglish = Greeting.english
// test: String = "Hi"

val greetingEspanol = Greeting.espanol
// test: String = "Hola"

// Here is a proof that an object is a singleton, and not a static method in a class:

val x = Greeting
val y = x

val greetingEq1 = x eq y //Reminder: eq checks for reference
// test: Boolean = true

val z = Greeting

val greetingEq2 = x eq z
// test: Boolean = true

// An object that has the same name as a class is called a companion object of the class, and it is often used to contain factory methods for the class that it complements:

class Movie(val name: String, val year: Short)

object Movie:
  def academyAwardBestMoviesForYear(x: Short) = 
    //This is a match statement, more powerful than a Java switch statement!
    x match
      case 1930 => Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 => Some(new Movie("Cimarron", 1931))
      case 1932 => Some(new Movie("Grand Hotel", 1932))
      case _ => None

val movieName = Movie.academyAwardBestMoviesForYear(1932).get.name
// test: String = "Grand Hotel"

// A companion object can also see private values and variables of the corresponding classes' instantiated objects:

class Person(
  val name: String,
  private val superheroName: String) //The superhero name is private!

object Person:
  def showMeInnerSecret(x: Person) = x.superheroName

val clark = new Person("Clark Kent", "Superman")
val peter = new Person("Peter Parker", "Spider-Man")

val clarkName = Person.showMeInnerSecret(clark)
// test: String = "Superman"

val peterName = Person.showMeInnerSecret(peter)
// test: String = "Spider-Man"