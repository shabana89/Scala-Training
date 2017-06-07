//Given 2 integer values greater than 0, return whichever value is closest to 21 without going over 21.
// If they both go over 21 then return 0//
// Underscore _ is a while card//
def blackJack (a:Int, b:Int): Int = (a,b) match {
  case (a, b) if a <= 21 && (a > b || b > 21) => a
  case (a, b) if b <= 21 && (b > a || a > 21) => b
  case _ => 0
}
blackJack(18,21)
blackJack(20,18)
blackJack(22,22)

//Given 3 integer values, return their sum. If one value is the same as another value, they do not count
//towards the sum. Aka only return the sum of unique numbers given.//
def uniqueSum (a:Int, b:Int, c:Int): Int = (a,b,c) match {
  case (a, b, c) if a != b && b != c && a != c => a + b + c
  case (a, b, c) if a == b && b == c && a == c => 0
  case (a, b, c) if a == b && (c != a && c!= b) => c
}
uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)

//Given an integer value and a Boolean value, temperature and isSummer, if temperature is between 60 and 90
//(inclusive), unless its summer where the upper limit is 100 instead of 90. Return true if the temperature
// falls within the range, false otherwise.//
def tooHot (temperature:Int, isSummer:Boolean): Unit = {
  if (temperature >= 60 && temperature <= 90 && !isSummer) {
    println(true)
  }
  else if (temperature >= 60 && temperature <= 100 && isSummer) {
    println(true)
  }
  else {
    println(false)
  }
}
tooHot(80,false)
tooHot(100,false)
tooHot(100,true)


def tooHot2 (temperature:Int, isSummer:Boolean): Int = (temperature, isSummer) match {
}

