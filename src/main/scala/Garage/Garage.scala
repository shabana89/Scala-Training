//Need to add: Fixing vehicles and Calculating bills but will do this later in Stage 3.

class Garage {


  var vehicles = scala.collection.mutable.Map[String, Vehicle]()
  var employees = scala.collection.mutable.Map[Int, Employee]()
  var employeeAvailability.Double (Int)
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
