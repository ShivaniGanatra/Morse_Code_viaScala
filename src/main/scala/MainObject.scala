object MainObject {
  val input = new InputHandler
  val morseCode = new MorseCode
  val translator = new Translator
  val output = new OutputHandler

  def main(args: Array[String]): Unit = {
    println(input.beginningSentence)
    val name = scala.io.StdIn.readLine()
    input.helloPerson(name)
    val choice = input.chooseAorB
    println("choice types " + choice)

    if (choice == "A" || choice == "a") println(s"You have chosen $choice please enter a word or sentence: ")
    else println(s"You have chosen $choice please enter a morse word or morse sentence: ")

    //a is word to morse
    //b is morse to word
    val result = if(choice == "A" || choice == "a") input.validateWord()
    else input.validateMorse()
    println("valid result " + result)
    val translatedString = if (choice == "A" || choice == "a") translator.letterToMorse(result,morseCode.letterToMorse)
    else translator.morseToLetter(result,morseCode.MorseToLetter)
    if (choice == "A" || choice == "a") output.printResultWordsToMorse(translatedString)
    else output.printResultMorseToWords(translatedString)

  }
}
