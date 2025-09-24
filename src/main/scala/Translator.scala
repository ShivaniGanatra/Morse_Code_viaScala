class Translator extends App{

  def letterToMorse(letterString: String, morseMap: Map[Char, String]): String = {
    val uppercaseList = letterString.toUpperCase.toList
    val morseCodeList = uppercaseList.map(x => morseMap(x))
    morseCodeList.mkString(" ") //make string
  }

  def morseToLetter(morseString: String, reverseMorseMap: Map[String,Char]): String = {
    val morseList = morseString.trim.split(" ").toList //added trim in case of unnecessary spaces in front of and at end of word
    val letterList = morseList.map(x => reverseMorseMap(x))
    letterList.mkString //make string
  }

  /*
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
   */

  //do pure functions hav extrnal parametrs probabaly not
}

