class Bike (val bikeMakeAndModel:String, val bikeRepairType:String, val bikeRepairCost:Int, bikeRegistrationNum:String) extends Vehicle {

  val makeAndModel: String = bikeMakeAndModel
  val repairType: String = bikeRepairType
  val repairCost: Int = bikeRepairCost
  val registrationNum: String = bikeRegistrationNum

  override def toString: String = s"The bike is a $makeAndModel. The repair type is a $repairType " +
    s"and this will cost $repairCost pounds to repair. The bike ID is $registrationNum."

}

//val bike: Bike = new Bike ("Dayton C3","faulty right brake",250,"YH43 RSA")
