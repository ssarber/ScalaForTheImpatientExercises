//object chap5 extends App { 
//  
//  class Counter { 
//	  private var value = Int.MaxValue - 1
//	  def increment() { if (value < Int.MaxValue) value += 1 }
//	  def current() = value
//  }
//  
//  object BankAccount extends App{
//	  private var _balance: Double = 0
//	  def balance = _balance
//    def deposit(amount: Double) {
//      _balance = 0 + amount 
//    }
//    def withdraw(amount:Double) {
//      _balance -= amount
//    }
//    var x = deposit(2)
//      println(x)
//      println(2)
      
//     class Time(private var hours: Int, private var minutes: Int) extends App {
////    		private var hours = 0
////    		private var minutes = 0
//    
//    	 	// ex. 3
////    		def before(other: Time): Boolean = {
////    		  if (other.hours > hours) true
////    		  else if (other.hours == hours && other.minutes > minutes) true
////    		  else false   
////    		}
//    		
//    		// ex. 4 
//    		def before(other: Time): Boolean = {
//    		  var minSinceMidnightOfInitialObj = hours * 60 + minutes
//    		  var minSinceMightOfObjToCopmpare = other.hours * 60 + other.minutes
//    		  if (minSinceMightOfObjToCopmpare > minSinceMidnightOfInitialObj) true
//    		  else false
//    		}
//
//  }
//     object Z extends App{
//      	var t = new Time(3, 00)
//    	var z = new Time(3, 10)
//    	println(t.before(other = z)) 
//
//}
     
//class Person(val name: String, ageParam: Int) extends App {
//  val age = if (ageParam < 0) 0 else ageParam
//  
//  
//}
//
//     object P extends App{
//      	var p = new Person("fdfd", -30)
//
//    	println(p.age)
//     }

// }
////  
//
//  
//}