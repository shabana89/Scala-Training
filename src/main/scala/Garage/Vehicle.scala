abstract class Vehicle {


  val registrationNum: String
  val parts: List[Part] = Part.getBrokenParts
}

object Vehicle

private class car extends Vehicle {



}

private class bike extends Vehicle{



}