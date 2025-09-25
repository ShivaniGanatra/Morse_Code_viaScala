import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.language.postfixOps

class InputHandler {
  val beginningSentence = "Hi please enter your name : "

  final def helloPerson(personName:String): Unit = {
    println(s"Hello $personName! Can you please type A or a if you want to translate a word/sentence to morse." +
      s" \nType B or b if you want to translate morse to a word/sentence: ")
  }

  @tailrec
  final def chooseAorB: String = {
    val line = readLine()
    line match {
      case "A" => line
      case "a" => line
      case "B" => line
      case "b" => line
      case _ => println("Select A, a, B or b"); chooseAorB
    }
  }

  def validateWord():String = {
    val line = readLine
    if(line.matches("^[a-zA-Z\\s]*$")) return line
    else println("Please enter a valid word or sentence with only letters and spaces if needed");validateWord()
  }

  def validateMorse(): String = {
    val line = readLine
    if (line.contains(".") || (line.contains(".") && line.contains("/")) ) return line
    else println("Please enter a valid morse code sentence with ... and // if needed"); validateMorse()
  }


}





//  //https://www.geeksforgeeks.org/scala/how-to-take-input-from-a-user-in-scala/

