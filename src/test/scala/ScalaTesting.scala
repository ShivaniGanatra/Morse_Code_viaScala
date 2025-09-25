import org.scalatest.funsuite.AnyFunSuite
class ScalaTesting extends AnyFunSuite {
  val translator = new Translator
  val morse = new MorseCode
  val input = new InputHandler
  val output = new OutputHandler

  //Testing translations
  test("morse translates to string") {
    assert(translator.letterToMorse("shivani",morse.letterToMorse) == "... .... .. ...- .- -. ..")
  }

  test("translates to morse") {
    assert(translator.morseToLetter("... -.-. .- .-.. .- / .-.. . .- .-. -. .. -. --.", morse.morseToLetter) == "SCALA LEARNING")
  }

  //Test morse seperation
  test("words are separated") {
    assert(translator.morseToLetter("... . / .--. .- / .-. .- - .", morse.morseToLetter) == "SE PA RATE")
  }

  test("invalid inputs") {
    val result = input.chooseAorB()
    assert(result.equals("a") || result.equals("b") || result.equals("A") || result.equals("B"))
  }
}