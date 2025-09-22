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
  //val new_collection = collection.map(x => x * x )
  def letterToMorse(a: String): String = {
    val b = a.toUpperCase.toList
    val c = b.map(x=>morseCode(x))
    c.toString()


  }

  println(letterToMorse("shivani"))
}
