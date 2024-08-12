object second{

  def NumberCategorizer(number: Int): String = {
    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    number match{
      case n if isMultipleOfFive(n) && isMultipleOfThree(n) => "Multiple of Both Three and Five"
      case n if isMultipleOfThree(n) => "Multiple of Three"
      case n if isMultipleOfFive(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter a integer: ")
    val number = scala.io.StdIn.readInt()

    println(NumberCategorizer(number))
  }
}