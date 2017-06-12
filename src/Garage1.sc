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

}

class Car (val carMakeAndModel:String, val carRepairType:String, carRepairCost:Int) extends Vehicle {

  val makeAndModel: String = carMakeAndModel
  val repairType: String = carRepairType
  val repairCost: Int = carRepairCost

  override def toString: String = s"The car is a $makeAndModel. The repair type is a $repairType" +
                                  s"and this will cost $repairCost pounds to repair."

}

val car: Car = new Car("Diahatsu Sirrion","flat tyre",55)

class Bike (val bikeMakeAndModel:String, val bikeRepairType:String, val bikeRepairCost:Int) extends Vehicle {

  val makeAndModel: String = bikeMakeAndModel
  val repairType: String = bikeRepairType
  val repairCost: Int = bikeRepairCost

  override def toString: String = s"The bike is a $makeAndModel. The repair type is a $repairType " +
                                  s"and this will cost $repairCost pounds to repair."

}

val bike: Bike = new Bike ("Dayton C3","faulty right brake",250)


//Stage 2

class Garage (val addingVehicles:Any, removingVehicles:Any, registeringEmployees:Any, fixingVehicles:Any,
              calculatingBills:Any, outputtingTheContentsOfTheGarage:Any, openGarage:Any, closeGarage:Any) {



}
