import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.language.postfixOps

class InputHandler {
  val beginningSentence = "Hi please enter your name : "

  final def helloPerson(personName:String): Unit = {
    println(s"Hello $personName! Can you please type A or a if you want to translate a word/sentence to morse. Type B or b if you \n" +
      s"want to translate morse to a word/sentence: ")
  }

  @tailrec
  final def chooseOne: String = {
    val line = readLine()
    line match {
      case "A" => line
      case "a" => line
      case "B" => line
      case "b" => line
      case _ => println("Select A, a, B or b"); chooseOne
    }
  }
  
  def validateWord():Unit = {
    val line = readLine
    if(line.matches("^[a-zA-Z\\s]*$")) return line
    else println("enter a valid string");validateWord()
  }
  
  
}





//  //https://www.geeksforgeeks.org/scala/how-to-take-input-from-a-user-in-scala/

