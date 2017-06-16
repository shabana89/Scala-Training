//Need to add: Fixing vehicles and Calculating bills but will do this later in Stage 3.

class Garage {


  var vehicles = scala.collection.mutable.Map[String, Vehicle]()
  var employees = scala.collection.mutable.Map[Int, Employee]()
  //var employeeAvailability.Double (Int)
  val workingHoursPerDay:Double = 8
  var isOpen = false



  def open(): Unit = {
    isOpen = true
  }

  def close(): Unit = {
    isOpen = false
  }

  def addingVehicles(vehicle: Vehicle): Unit = {
    vehicles += (vehicle.registrationNum -> vehicle)

  }

  def removingVehicles(vehicle: Vehicle): Unit = {
    vehicles -= (vehicle.registrationNum)
  }


  def outputContents (): Unit = {

    println(s"The amount of vehicles in the garage is ${vehicles.size}.")

  }

  def registeringEmployees (employee: Employee): Unit = {
    employees += (employee.employeeNumber -> employee)

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
