class InputHandler {
  //https://www.geeksforgeeks.org/scala/how-to-take-input-from-a-user-in-scala/
    def main(args: Array[String]): Unit = {
      println("Enter your name:")
      val name = scala.io.StdIn.readLine()
      println("Hello, " + name)
      println("Can you please type A if you want to translate a word/sentence to morse or B if you want to " +
        "translate morse to a word/sentence : ")
      // if the user types B
      val letter = scala.io.StdIn.readLine()
      println("You have selected B. The format of the morse code is between each letter put a space and between each \n" +
        "word in a sentence type. For example .... . .-.. .-.. --- / .-- --- .-. .-.. -.. will give Hello World. Please \n" +
        "enter the morse code word here and then click enter: ")
      val value = scala.io.StdIn.readLine()
      println("The translated word/sentence is ....")
    }

    //OutputHandler.printResultMorseToWords("hello")
  }

