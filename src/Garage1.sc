//Stage 1

abstract class Person {

  val firstName: String
  val lastName: String
  val phoneNumber: String

}

class Employee (val employeeFirstName:String, val employeeLastName:String, val employeeNumber:Int,
                val employeePhoneNumber:String) extends Person {

  val firstName:String = employeeFirstName
  val lastName:String = employeeLastName
  val phoneNumber:String = employeePhoneNumber

  override def toString: String = s"Hi my name is $firstName $lastName. My employee number is $employeeNumber " +
                                  s"and my phone number is $phoneNumber."

}

val Employee: Employee = new Employee("John","Chambers",183,"07487776632")


class Customer (val customerFirstName:String, val customerLastName:String, val customerAge:Int,
                val customerPhoneNumber:String) extends Person {

  val firstName:String = customerFirstName
  val lastName:String = customerLastName
  val phoneNumber:String = customerPhoneNumber

  override def toString: String = s"My name is $firstName $lastName and i am $customerAge " +
                                  s"years old. My phone number is $phoneNumber."
}

val customer: Customer = new Customer("Amy","Smith",25,"07483326476")



abstract class Vehicle {

  val makeAndModel: String
  val repairType: String
  val repairCost: Int
  val registrationNum: String

}

class Car (val carMakeAndModel:String, val carRepairType:String, carRepairCost:Int, carRegistrationNum:String) extends Vehicle {

  val makeAndModel: String = carMakeAndModel
  val repairType: String = carRepairType
  val repairCost: Int = carRepairCost
  val registrationNum: String = carRegistrationNum

  override def toString: String = s"The car is a $makeAndModel. The repair type is a $repairType" +
                                  s"and this will cost $repairCost pounds to repair. The car ID is $registrationNum."


}

val car: Car = new Car("Diahatsu Sirrion","flat tyre",55,"KS32 VTG")


class Bike (val bikeMakeAndModel:String, val bikeRepairType:String, val bikeRepairCost:Int, bikeRegistrationNum:String) extends Vehicle {

  val makeAndModel: String = bikeMakeAndModel
  val repairType: String = bikeRepairType
  val repairCost: Int = bikeRepairCost
  val registrationNum: String = bikeRegistrationNum

  override def toString: String = s"The bike is a $makeAndModel. The repair type is a $repairType " +
                                  s"and this will cost $repairCost pounds to repair. The bike ID is $registrationNum"

}

val bike: Bike = new Bike ("Dayton C3","faulty right brake",250,"YH43 RSA")


//Stage 2

class Garage {


  var vehicles = scala.collection.mutable.Map [String, Vehicle]()
  var employees = scala.collection.mutable.Map [Int, Employee]()
  var isOpen = false


  def open(): Unit = {
    isOpen = true
  }

  def close (): Unit = {
    isOpen = false
  }

  def addingVehicles (vehicle:Vehicle): Unit = {
  vehicles += (vehicle.registrationNum -> vehicle)

  }

  def removingVehicles (vehicle: Vehicle): Unit = {
    vehicles -= (vehicle.registrationNum)
  }

//  def calculatingBills (cost1:Int, cost2:Int, cost3:Int) = {
//
//   cost1 + cost2 = cost3
//
//  }

  val outputtingContentsOfGarage = String {


    override def toString: String = s"The final amount made today is $outputtingContentsOfGarage."


  }

}


//Stage 3

//Introduce a new class, Part, a car will be comprised of numerous parts and some will have
//the state of Broken, from this point on all vehicles that are in the garage will be comprised
//of at least 10 parts and will have a random amount of parts assigned to Broken when
//checked into the garage. Fixing the vehicle and billing the vehicle will also take into account
//Parts

//Design a que system for fixing vehicles. This will be composed of numerous segments.

//If an employee of the garage is available
//How many parts are broken on the car
//How long each part takes to be fixed
//You Garage should now be designed with this process in mind;
//Garage opens, 10-20 vehicles immediately all get in line to be fixed.
//Output how long it takes for all vehicles to be fixed, at what point each vehicle was
//tended to and finished fixing, which employee tended to which vehicle, and how
//much each car repair cost and then the total earnings for the garage that day.


abstract class Part {

  val costOfPart: Int
  val timeToFix: Double

}


def

