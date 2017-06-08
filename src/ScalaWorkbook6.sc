//Lazy Evaluation
//def - is set each times its called and is always a different random number
//val - is set when defined and the value doesn't change, its set as a constant
//lazy val - is only initialised when its needed and once called it stays as the same number

def randomInt = {Random.nextInt()}

randomInt
randomInt
randomInt

val randomDouble = {Random.nextDouble()}

randomDouble
randomDouble
randomDouble

lazy val - randomLong = {Random.nextLong ()}

randomLong
randomLong
randomLong

//Optionals - give a function a variable as an option if you want to use it.

//can iterate through a collection with maps or for each function. Map would update the values in the
//collection but a for each would just go through the collection.

//flat map - if you had a collectyion of collections - flat maps would make it into one big collection.


