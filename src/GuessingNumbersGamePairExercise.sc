
object GuessingGame extends App {
  println("From 0 to?")
  val upper = Console.readInt()
  guess(upper, 1)

  def guess(highest: Int, lowest: Int): Unit = {
    val number = (highest + lowest) / 2
    println(s"is your number $number ?")
    val correct = Console.readInt == 1
    if (correct) {
      println("I WIN")

    } else if (highest <= lowest) {
      println("Cheater")

    } else {
      println("Number is higher?")
      val isHigher = Console.readInt == 1
      if (isHigher) {
        guess(highest, number + 1)
      } else {
        guess(number - 1, lowest)
      }
    }
  }
}​

