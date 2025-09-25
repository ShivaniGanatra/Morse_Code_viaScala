object MainObject {
  val input = new InputHandler
  def main(args: Array[String]): Unit = {
    println(input.beginningSentence)
    val name = scala.io.StdIn.readLine()
    input.helloPerson(name)
    val choiceTypes = input.chooseAorB
    println("choice types " + choiceTypes)
    //a is word to morse
    //b is morse to word
    val result = if(choiceTypes == "A" || choiceTypes == "a") input.validateWord()
    else input.validateMorse()
    println("valid result " + result)


  }
}
