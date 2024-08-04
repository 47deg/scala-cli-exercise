//> using dep com.raquo::laminar::17.0.0
//> using dep com.raquo::airstream::17.0.0

//> using dep org.scala-js::scalajs-dom::2.2.0
//> using platform scala-js

import org.scalajs.dom
import scala.scalajs.js
import com.raquo.laminar.api.L.{*, given}

object Hello {
  def main(args: Array[String]): Unit = {
    val parNode = dom.document.createElement("p")
    parNode.textContent = "Esteban"
    dom.document.body.appendChild(parNode)
  }
}

// object HelloWorldView {

//   def apply(): HtmlElement = {
//     div(
//       renderExample(),
//       // CodeSnippets(_.`hello world`)
//       "test"
//     )
//   }

//   def renderExample(): HtmlElement = {

//     val nameVar = Var(initial = "world")
//     div(
//       label("Your name: "),
//       input(
//         placeholder := "Enter your name here",
//         onInput.mapToValue --> nameVar
//       ),
//       p(
//         "Hello, ",
//         text <-- nameVar.signal.map(_.toUpperCase)
//       )
//     )
//     // END[hello world]
//   }
// }
