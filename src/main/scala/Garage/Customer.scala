class Customer (customerFirstName:String, customerLastName:String, customerAge:Int,
                customerPhoneNumber:String) extends Garage.Person {

  val firstName:String = customerFirstName
  val lastName:String = customerLastName
  val phoneNumber:String = customerPhoneNumber

  override def toString: String = s"My name is $firstName $lastName and i am $customerAge " +
    s"years old. My phone number is $phoneNumber."
}

//val customer: Customer = new Customer("Amy","Smith",25,"07483326476")
