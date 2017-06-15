class Car (carRegistrationNum:String) extends Vehicle {


  val registrationNum: String = carRegistrationNum

  override def toString: String = s"The car is a $makeAndModel. The repair type is a $repairType" +
    s"and this will cost $repairCost pounds to repair. The car ID is $registrationNum."


}

//val car: Car = new Car("Diahatsu Sirrion","flat tyre",55,"KS32 VTG")
