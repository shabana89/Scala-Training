import scala.collection.immutable.Range

println("Hello World")

var myVar : String = "Hello World"
println (myVar)

def welcomeUser (name: String): Unit = {
  println (s"Name: $name")
}
welcomeUser("Shabana")

def helloWorld(): String = {
  "Hello World"
}

helloWorld()
welcomeUser(helloWorld())

def outputAnything (anything: Any): Any = {
  anything
}

outputAnything("hell world")
outputAnything(5)
outputAnything(5.34)
outputAnything(true)

def cutString (name: String, numberOfCharachters: Int) = {
name.substring(name.length-numberOfCharachters)
}
cutString("hello",3)

def fourParameters (part1: String, part2: String, thingToReplace: String, replacement: String) = {
  var joined = part1.concat(part2)
  joined.replaceAll(thingToReplace, replacement)
}
fourParameters("Ha","llo","a","e")



def addingNumbers(number1: Int, number2: Int) = {

  number1 + number2
  println("Addition of number1 + number2 =")

}








