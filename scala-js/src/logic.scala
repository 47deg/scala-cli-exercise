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
