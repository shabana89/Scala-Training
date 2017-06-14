//Task 3
def evenlySpaced (small:Int, medium:Int, large:Int): Boolean = {

  if small

}

//Task 4
def fibonacciSequence (a:Int):Int = {

  if (a > 0)
    fibonacciSequence(a + a)
  println(a)
}

fibonacciSequence(0)
fibonacciSequence(1)
fibonacciSequence(2)

//Task 8
def stringClean (a:String): String = {

  if (a==a) {

    stringClean(a.substring(+1))
    println(a)
  }

}

stringClean("yyzzza")
stringClean("abbbcdd")
stringClean("Hello")

