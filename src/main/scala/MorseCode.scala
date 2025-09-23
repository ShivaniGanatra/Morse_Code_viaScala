object MorseCode extends App{
  val morseCode: Map[Char, String] = Map(
    'A' -> ".-", 'B' -> "-...", 'C' -> "-.-.", 'D' -> "-..",
    'E' -> ".", 'F' -> "..-.", 'G' -> "--.", 'H' -> "....",
    'I' -> "..", 'J' -> ".---", 'K' -> "-.-", 'L' -> ".-..",
    'M' -> "--", 'N' -> "-.", 'O' -> "---", 'P' -> ".--.",
    'Q' -> "--.-", 'R' -> ".-.", 'S' -> "...", 'T' -> "-",
    'U' -> "..-", 'V' -> "...-", 'W' -> ".--", 'X' -> "-..-",
    'Y' -> "-.--", 'Z' -> "--..", ' ' -> "/"
  )

  val reversedMorse = morseCode.map(x => x.swap) //reversed key value to value key

  def letterToMorse(letterString: String): String = {
    val uppercaseList = letterString.toUpperCase.toList
    val morseCodeList = uppercaseList.map(x=>morseCode(x))
    morseCodeList.mkString(" ") //make string
  }

  def morseToLetter(morseString: String): String = {
    val morseList = morseString.trim.split(" ").toList //added trim in case of unnecessary spaces in front of and at end of word
    val letterList = morseList.map(x => reversedMorse(x))
    letterList.mkString //make string
  }

  println("shivani in morse code is " + letterToMorse("shivani"))

  println("morse to words is " + morseToLetter("    - .... .. ... / .. ... / ... -.-. .- .-.. .-   "))
//morse to words is THIS IS SCALA
 //when applying use try catch in main file
}
