import scala.io.StdIn.readLine

object InputHandler {

  val beginningSentence = "Hi please enter your name : "

  def helloPerson(personName:String): Unit = {
    println(s"Hello $personName! Can you please type A or a if you want to translate a word/sentence to morse. Type B or b if you \n" +
      s"want to translate morse to a word/sentence: ")
  }

  def chooseOne: String = {
    val line = readLine()
    line match {
      case "A" => line
      case "a" => line
      case "B" => line
      case "b" => line
      case _ => println("Select A, a, B or b"); chooseOne
    }
  }



  //https://www.geeksforgeeks.org/scala/how-to-take-input-from-a-user-in-scala/
    def main(args: Array[String]): Unit = {
        println(beginningSentence)


      val name = scala.io.StdIn.readLine()
        helloPerson(name)
      val choiceTypes = chooseOne
      println("choice types " + choiceTypes)

//      println("Hello, " + name)
//      println(InputHandler.question)
//      println("Can you please type A if you want to translate a word/sentence to morse or B if you want to " +
//        "translate morse to a word/sentence : ")
//      // if the user types B
//      val letter = scala.io.StdIn.readLine()
//      println(InputHandler.chooseAorB(letter))


//      println("You have selected B. The format of the morse code is between each letter put a space and between each \n" +
//        "word in a sentence type. For example .... . .-.. .-.. --- / .-- --- .-. .-.. -.. will give Hello World. Please \n" +
//        "enter the morse code word here and then click enter: ")
//      val value = scala.io.StdIn.readLine()
//      println("The translated word/sentence is ....")

//      def getChoice: String = {
//        val line = readLine()
//        line match {
//          case "1" => println("Not implemented"); line
//          case "2" => println("Not implemented"); line
//          case "3" => println("Not implemented"); line
//          case "4" => println("Not implemented"); line
//          case "5" => println("Thanks for using."); line
//          case _ => println("Error, blah blah."); getChoice
//        }
//      }

      //https://stackoverflow.com/questions/5334638/repeated-prompt-until-correct-input
//
//      val choiceType = getChoice.toInt

//      def chooseOne: String = {
//        val line = readLine()
//        line match {
//          case "A" => line
//          case "a" => line
//          case "B" => line
//          case "b" => line
//          case _ => println("Select A, a, B or b"); chooseOne
//        }
//      }



    }




    //OutputHandler.printResultMorseToWords("hello")
  }

