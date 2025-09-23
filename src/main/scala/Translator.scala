object Translator extends App{
  val morseCodeObject = new MorseCode
  def letterToMorse(letterString: String): String = {
    val uppercaseList = letterString.toUpperCase.toList
    val morseCodeList = uppercaseList.map(x => morseCodeObject.morseCode(x))
    morseCodeList.mkString(" ") //make string
  }

  def morseToLetter(morseString: String): String = {
    val morseList = morseString.trim.split(" ").toList //added trim in case of unnecessary spaces in front of and at end of word
    val letterList = morseList.map(x => morseCodeObject.reversedMorse(x))
    letterList.mkString //make string
  }
}
