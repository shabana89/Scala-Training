//Rewrite your previous conditional exercises to use pattern matching//
//1//
def conditionals1 (a:Int, b:Int, c:Boolean): Int = (a,b,c) match {
  case (a, b, true) => a + b
  case _  => a * b
}
conditionals1(4,2,true)
conditionals1(4,2,false)

//2//
def conditionals2 (a:Int, b:Int, c:Boolean): Int = {(a,b,c) match {
  case (a,b,c) if a.equals(0) => b
  case (a,b,c) if b.equals(0) => a
  case (a,b,c) if a.equals(0) && b.equals(0) => 0
  case (a, b, true) => a + b
  case (a,b,false)  => a * b
  case _ => 0
}}
conditionals2 (0,2,true)
conditionals2(0,2,false)
conditionals2(4,0,true)
conditionals2(4,0,false)
conditionals2 (0,0,true)


//Create a method that takes a pair of integers and then returns the pair swapped around using pattern matching
//Your method should work with a List, Array and Tuple input.
//Additional – Accept a Collection that has more than two inputs and returns the collection with the first two

def patternMatch (numbers: Any): Any = numbers match {
  case list: List[Int] => list.reverse
  case array: Array[Int] => array.reverse
  case tuple: Tuple2[Int, Int] => tuple.swap
  case _ =>
}

patternMatch(1,2)