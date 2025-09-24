class OutputHandler extends App{
  def printResultMorseToWords(letterString: String): Unit = {
    println(s"The printed result from morse Code to words is: $letterString")
  }

  def printResultWordsToMorse(morseString: String): Unit = {
    println(s"The printed result from words to morse is: $morseString")
  }
}
