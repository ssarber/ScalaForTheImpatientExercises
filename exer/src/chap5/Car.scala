package chap5

// 8
class Car (val manufacturer: String,
		val name: String,
		val modelYear: Int = -1,
		var licensePlate: String = ""){

}

object Zuk extends App {
  
  val aston = new Car("Aston Martin", "DB9")
  println(aston.modelYear)
}