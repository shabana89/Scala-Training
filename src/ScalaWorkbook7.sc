
def maths (num1:Int, num2:Int, num3:Int): Unit = {
  var toPrint: String = ""
  toPrint= toPrint + mathsOrderDoesntMatter(num1, num2, num3)
  toPrint= toPrint + mathsOrderDoesntMatter(num2, num3, num1)
  toPrint= toPrint + mathsOrderDoesntMatter(num1, num3, num2)
  println(toPrint)
}
def mathsOrderDoesntMatter(num1:Int, num2:Int, num3:Int): String = {
  var toReturn: String = ""
  if(num1 + num2 == num3) toReturn = toReturn + num1 + " + " + num2 + " = " + num3 + ". "
  if(num1 * num2 == num3) toReturn = toReturn + num1 + " * " + num2 + " = " + num3 + ". "
  toReturn = toReturn + mathsOrderMatters(num1, num2, num3)
  toReturn
}

def mathsOrderMatters(num1:Int, num2:Int, num3:Int): String = {
  var toReturn: String = ""
  if(num1 - num2 == num3) toReturn = toReturn + num1 + " - " + num2 + " = " + num3 + ". "
  if(num1 / num2 == num3) toReturn = toReturn + num1 + " / " + num2 + " = " + num3 + ". "
  if(num2 - num1 == num3) toReturn = toReturn + num2 + " - " + num1 + " = " + num3 + ". "
  if(num2 / num1 == num3) toReturn = toReturn + num2 + " / " + num1 + " = " + num3 + ". "
  toReturn
}
 maths(4, 2, 8)



def mathsS2 (num1:Int, num2:Int, num3:Int): Unit = {
  var toPrint: String = ""
  toPrint= toPrint + mathsOrderDoesntMatterS2(num1, num2, num3)
  toPrint= toPrint + mathsOrderDoesntMatterS2(num2, num3, num1)
  toPrint= toPrint + mathsOrderDoesntMatterS2(num1, num3, num2)
  println(toPrint)
}
def mathsOrderDoesntMatterS2(num1:Int, num2:Int, num3:Int): String = {
  var toReturn: String = ""
  toReturn = toReturn + num1 + " + " + num2 + " = " + num3 + ". "
  toReturn = toReturn + num1 + " * " + num2 + " = " + num3 + ". "
  toReturn = toReturn + mathsOrderMattersS2(num1, num2, num3)
  toReturn
}

def mathsOrderMattersS2(num1:Int, num2:Int, num3:Int): String = {
  var toReturn: String = ""
  toReturn = toReturn + num1 + " * " + num2 + " = " + num3 + ". "
  toReturn = toReturn + num1 + " - " + num2 + " = " + num3 + ". "
  toReturn = toReturn + num2 + " * " + num1 + " = " + num3 + ". "
  toReturn = toReturn + num2 + " - " + num1 + " = " + num3 + ". "
  toReturn
}
mathsS2(4, 2, 8)

var toSplit: String = "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987"
var splitArray: Array[String] = toSplit.split(", ")
for (s <- 2 to splitArray.length-1){
  maths(splitArray(s-2).toInt, splitArray(s-1).toInt, splitArray(s).toInt)
}










