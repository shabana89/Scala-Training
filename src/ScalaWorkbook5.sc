//implicit class - benefit is that you can add functionality to it

//asteric * allows to use multiple values

//pure funtion - take in inputs and provide the same outputs - they dont change anything

//currying - function parameters are split into group and so they can be called when needed

//pattern matching is similar to switch statements but more powerful

//Typed pattern - looking for a certain type

//pattern guard is when an if statement is placed - if (true) =>

//functions as symbols - assigning a function to a symbol and then using that symbol to call the function

//Tuples combine a fixed number of items together so that they can be passed around as a whole.
//They can take between 1 and 22 different arguments. Unlike an array or list, a tuple can hold objects
//with different types but they are also immutable. i.e Tuple4('a', 'b', "Hello", 1) would have the type
// Tuple4[Char, Char, String, Int]. you can use method tuple._1 to access the first element, tuple._2 to
//access the second, and so on

//Implicit values can be defined anywhere in the code base by having implicit before the val.

//Currying - when function parameters are split into groups therefore using parenthesis around each
//argument rather than commas. i.e.

def totalPrice (quantity:Int) (discount: Double) (beerType: String)

//Partial function - When you invoke a function, you're said to be applying the function to the arguments.
//If you pass all the expected arguments, you have fully applied it. If you send only a few arguments, then
//you get back a partially applied function. This gives you the convenience of binding some arguments and
//leaving the rest to be filled in later

//Closure allows us to have functions that refer to one or more fields that are in the same scope where
//the function is declared.

//Implicit - means global - can call it anywhere in a program and it will display the output

//Recursion - not able to use any loops - use functions in functions through if statements
