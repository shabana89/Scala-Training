//Create a method that accepts two parameters, a string and an integer. Your method should print out the string//
//provided as many times as the integer designates//
var duplicateHi = 3
while (duplicateHi > 0) {
  println("Hi")
  duplicateHi -= 1
}

//Create a method accepts two parameters, one a String and the other an integer, your method will then output
//that string in a rectangle-like fashion as many times as the number dictates.//
def quantity (a:String, b:Int): Unit = {
  for (i <-0 until b)
    println(a * b)
}
quantity("H",4)

//Create a method that accepts three parameters, two strings and one integer. Your method will then loop from 1 to//
//the integer provided, outputting the current iteration count every iteration. However if the current iteration is//
//divisible by 3, output the first String provided. If the current iteration is divisible by 5, output the second//
//String provided. If it is divisible by both 3 and 5, then output the concatenation of the two Strings.//
def fizzBuzz (a:String, b:String, c:Int): Unit = {
  for (i <- 1 to c) {
    if (i % 3 == 0 && i % 5 == 0) {
      println(a.concat(b))
    } else if (i % 3 == 0) {
      println(a)
    } else if (i % 5 == 0){
      println(b)
    } else {
      println(i)
    }
  }
}
fizzBuzz("Fizz", "Buzz", 15)

//Rewrite your previous three iteration exercises but using method recursion, no loops involved.//
//1//
def hiMessage (a:String, b:Int): Unit = {
  if (b > 1)
    hiMessage(a,b-1)
  println(a)
}
hiMessage("Hi",3)

//2//
def helloMessage (a:String, b:Int, c:Int): Unit = {
  if (b > 1)
    helloMessage(a,b - 1,c)
    println(a*c)
}
helloMessage("H",4, 4)

//3//
def fizzBuzz2 (a:String, b:String, i:Int): Unit = {
  if (i > 1) {
    fizzBuzz2(a, b, i - 1)
  }
  if (i % 3 == 0 && i % 5 == 0) {
    println(a.concat(b))
  } else if (i % 3 == 0) {
    println(a)
  } else if (i % 5 == 0){
    println(b)
  } else {
    println(i)
  }
}
fizzBuzz2("Fizz", "Buzz", 15)




