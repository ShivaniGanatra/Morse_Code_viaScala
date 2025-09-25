object MainObject {
  val input = new InputHandler
  def main(args: Array[String]): Unit = {
    println(input.beginningSentence)
    val name = scala.io.StdIn.readLine()
    input.helloPerson(name)
    val choiceTypes = input.chooseOne
    println("choice types " + choiceTypes)
    val hey = input.validateWord()
  }
}
