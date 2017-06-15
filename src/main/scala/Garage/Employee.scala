class Employee (val employeeFirstName:String, val employeeLastName:String, val employeeNumber:Int,
                val employeePhoneNumber:String) extends Garage.Person {

  val firstName:String = employeeFirstName
  val lastName:String = employeeLastName
  val phoneNumber:String = employeePhoneNumber

  override def toString: String = s"Hi my name is $firstName $lastName. My employee number is $employeeNumber " +
    s"and my phone number is $phoneNumber."

}

//val Employee: Employee = new Employee("John","Chambers",183,"07487776632")






}