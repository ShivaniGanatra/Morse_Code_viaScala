class OutputHandler extends App{
  def printResultMorseToWords(letterString: String): Unit = {
    println(s"The printed result from morse code to words is: $letterString")
  }

  def printResultWordsToMorse(morseString: String): Unit = {
    println(s"The printed result from words to morse is: $morseString")
  }
}
