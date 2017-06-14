// Using java.util.TimeZone.getAvailableIDs write a single line of code that returns a data set that
// looks something like this
//Array(Abidjan, Blantyre, Douala, Kinshasa, Mbabane, Timbuktu, Argentina, Argentina, Belize, Catamarca,
//Curacao, Ensenada, Guatemala, Indiana, Kentucky, Managua, Mexico_City, Nome, Port-au-Prince, Resolute, Sitka,
//Thunder_Bay, Casey, Troll, Ashkhabad, Calcutta, Dubai, Istanbul, Khandyga, Manila, Qatar, Srednekolymsk,
//Ujung_Pandang, Yerevan, South_Georgia, Eucla, South, Atlantic, EasterIsland, GMT+5, GMT-13, GMT0, Belfast,
//Dublin, Lisbon, Nicosia, Saratov, Vaduz, Chagos, BajaNorte, Enderbury, Kiritimati, Pago_Pago, Tarawa,
//EST5, Aleutian, Pacific-New)
//Hints
//We only want the things after the slash
//split
//But some are only one length arrays, so we need to filter out the size one ones.
//filter()
//Then we want to group them in 10, a sample so to speak
//grouped()
//This can be done in one line of code, using the hints provided!


var ids = java.util.TimeZone.getAvailableIDs().map(x => x.split("/")).filter(p => p.length > 1).map(x => x.last).grouped(10).next()

java.util.TimeZone.getAvailableIDs()



