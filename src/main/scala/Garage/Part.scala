abstract class Part {

  val costOfPart: Double
  val timeToFix: Double
  var broken: Boolean = false
}


object Part {

  private class BodyWork extends Part {
    override val costOfPart: Double = 150.00
    override val timeToFix: Double = 03.00
  }

  private class Engine extends Part {
    override val costOfPart: Double = 400.00
    override val timeToFix: Double = 03.30
  }

  private class Gearbox extends Part {
    override val costOfPart: Double = 120.00
    override val timeToFix: Double = 01.00
  }

  private class Tyres extends Part {
    override val costOfPart: Double = 80.00
    override val timeToFix: Double = 00.45
  }

  private class Brakes extends Part {
    override val costOfPart: Double = 55.00
    override val timeToFix: Double = 00.30
  }

  private class Suspension extends Part {
    override val costOfPart: Double = 95.00
    override val timeToFix: Double = 01.45
  }

  private class ExhaustSystem extends Part {
    override val costOfPart: Double = 200.00
    override val timeToFix: Double = 02.45
  }

  private class LightsIndicators extends Part {
    override val costOfPart: Double = 45.00
    override val timeToFix: Double = 01.00
  }

  private class IgnitionSystem extends Part {
    override val costOfPart: Double = 115.00
    override val timeToFix: Double = 03.00
  }

  private class ElectricalSystem extends Part {
    override val costOfPart: Double = 75.00
    override val timeToFix: Double = 02.00
  }


  def getBrokenParts(): List[Part] = {

    val parts = List[Part](new BodyWork, new Engine, new Gearbox, new Tyres, new Brakes, new Suspension, new ExhaustSystem, new LightsIndicators, new IgnitionSystem, new ElectricalSystem)
    parts.map(value => value.broken = math.random < 0.5)
    parts
  }
}




//Design a queue system for fixing vehicles. This will be composed of numerous segments.

//If an employee of the garage is available
//How many parts are broken on the car
//How long each part takes to be fixed
//Your Garage should now be designed with this process in mind;
//Garage opens, 10-20 vehicles immediately all get in line to be fixed.
//Output how long it takes for all vehicles to be fixed, at what point each vehicle was
//tended to and finished fixing, which employee tended to which vehicle, and how
//much each car repair cost and then the total earnings for the garage that day.


//need a factory like above for vehicle that randomly chooses whether its a car or bike next.



