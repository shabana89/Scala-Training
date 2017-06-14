//Task 1

//Given a string, return a string where for every char in the original, there are two chars.

def doubleChar(input:String): String = {

  var temporaryString = ""

  for (i <- 0 until input.length) {
    temporaryString += input.charAt(i)
    temporaryString += input.charAt(i)
  }
  temporaryString
}

doubleChar("The")
doubleChar("AAbb")
doubleChar("Hi-There")



//Task 2

//A sandwich is two pieces of bread with something in between. Return the string that is
//between the first and last appearance of "bread" in the given string, or return the empty
//string "" if there are not two pieces of bread.

"breadjambread".substring(5,8)
"xxbreadjambreadyy".substring(7,10)
"xxbreadyy".substring(9)



//Task 5
//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the
//total number of ears across all the bunnies recursively (without loops or multiplication).

def bunnyEars(input:Int): Int = {
  if(input == 0)
    0
  else
    2 + bunnyEars(input - 1)
}

bunnyEars(0)
bunnyEars(1)
bunnyEars(2)



//Task 7

//Given a string, return true if it ends in "ly".

def endsWithLy (input:String): Boolean = {

  if (input.length >= 2 && input.substring(input.length - 2, input.length) == "ly") {
    true
  } else {
    false
  }
}

endsWithLy("oddly")
endsWithLy("y")
endsWithLy("oddy")



//Task 7 (different method)

def endsWith (input:String): Boolean = {

  if (input.endsWith("ly")) {
    true
  } else {
    false
  }
}

endsWith("oddly")
endsWith("y")
endsWith("oddy")


