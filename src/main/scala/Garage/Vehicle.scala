abstract class Vehicle {


  val registrationNum: String
  val parts: List[Part] = Part.getBrokenParts
}

object Vehicle {

  var i = 0

  private class Car (reg: String) extends Vehicle {

    override val registrationNum: String = reg

  }

  private class Bike (reg: String) extends Vehicle {

    override val registrationNum: String = reg

  }


  def carOrBikeNext(): Vehicle = {

    i += 1



    if (math.random < 0.5)

      new Car("CAR324".concat(i.toString))

    else

      new Bike("BIKE324".concat(i.toString))

  }

}
