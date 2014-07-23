package chap8

//abstract class Item {
//  
//  def price: Double
//  def description: String
//
//}
//
//class SimpleItem(val price: Double = 10.99,  val description: String = "Yoga Mat Bag") extends Item {
//  
//}
//
//class Bundle(items: Item) extends Item {
//  override def price = 
//  
//}

object A extends App {
	def sum(lst: List[Int]): Int =
	  if (lst == Nil) 0 else lst.head + sum(lst.tail)
	  
	 val digits = List(1,2,3,4)
	 println(sum(digits))
}



