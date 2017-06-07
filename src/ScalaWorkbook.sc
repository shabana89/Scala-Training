//Output “Hello World!” via the println() method.//
println("Hello World")

//Store “Hello World!” in a variable and then output it.//
var myVar : String = "Hello World"
println (myVar)

//Create a method that accepts a string as a parameter, and then outputs that string.//
def welcomeUser (name: String): Unit = {
  println (s"Name: $name")
}
welcomeUser("Shabana")

//Create a method that returns a string, in this case “Hello World!”, which you then use to output.//
def helloWorld(): String = {
  "Hello World"
}
helloWorld()
welcomeUser(helloWorld())

//Create a method that does not signify a return type and outputs whatever is given to it,//
// then test it by passing it the follow different data types, Double, String, Integer, Boolean//
def outputAnything (anything: Any): Any = {
  anything
}
outputAnything("hell world")
outputAnything(5)
outputAnything(5.34)
outputAnything(true)

//Create a method that accepts two parameters, one being a string and one being an integer.//
def cutString (name: String, numberOfCharachters: Int) = {
name.substring(name.length-numberOfCharachters)
}
cutString("hello",3)

//Create a method that accepts 4 parameters, two being a String and two being a character, your method will//
//then join both strings together and then replace all occurrences of the character provided with the second//
//character provided.//
def fourParameters (part1: String, part2: String, thingToReplace: String, replacement: String) = {
  var joined = part1.concat(part2)
  joined.replaceAll(thingToReplace, replacement)
}
fourParameters("Ha","llo","a","e")

//Create a method that accepts two Integers as an input, then returns the sum of those integers.//
def addingNumbers(number1: Int, number2: Int) = {
  println(number1 + number2)
}
addingNumbers(4, 2)

//Modify your method from the previous task to accept another parameter, a Boolean. Your method will now//
//check if that Boolean is true, and if it is then it will return the sum of the two numbers provided, if it//
//is false it will return the multiplication of the two numbers instead.//
def addingOrMultiplying (number1: Int, number2: Int, add: Boolean)  = {
  if (add)
    number1 + number2
  else
    number1 * number2
}
addingOrMultiplying(4,2,true)
addingOrMultiplying(4,2,false)

//Modify your method from the previous task to have some more conditional statements to check if one of//
//the numbers is 0, which if this is true then you should return the other non-0 number. If both numbers//
//are 0 then return 0//
def addingOrMultiplying2 (number1: Int, number2: Int, add: Boolean)  = {
  if (number1.equals(0) && number2.equals(0)) {
    0
  }
  else if (number1.equals(0)) {
    number2
  }
  else if (number2.equals(0)) {
    number1
  }
  else if ( add ) {
    number1 + number2
  } else {
    number1 * number2
  }

}
addingOrMultiplying2 (0,2,true)
addingOrMultiplying2(0,2,false)
addingOrMultiplying2 (4,0,true)
addingOrMultiplying2(4,0,false)
addingOrMultiplying2 (0,0,true)







