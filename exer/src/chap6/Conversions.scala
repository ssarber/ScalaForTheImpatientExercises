package chap6

// 01
object Conversions {
  
  def inchesToCentimeters(inches: Double) = {
    inches * 2.54
  }
  
  def gallonsToLiters(gallons: Double) = {
    gallons * 4.54609188 
  }
  
  def milesToKilometers(miles: Double) = {
    miles * 1.6
  }
}



 // 02
abstract class UnitConversion extends App {
  def convert (value: Double) : Double 
}

object InchesToCentimeters extends UnitConversion {
  def convert(inches: Double):  Double = inches * 2.54
}
 
object GallonsToLiters extends UnitConversion {
  def convert(gallons: Double): Double = gallons * 3.8
}

object MilesToKilometers extends UnitConversion {
  def convert(miles: Double): Double = {
    miles * 1.6
  }
}

object Main extends App {
  
	println(InchesToCentimeters.convert(10))
//	println(Conversions.gallonsToLiters(1))
//	println(Conversions.milesToKilometers(1))

}