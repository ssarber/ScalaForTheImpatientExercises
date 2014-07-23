object chap12 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import scala.math._
  val num = 3.14                                  //> num  : Double = 3.14
  val increment = (x: Int) => x + 1               //> increment  : Int => Int = <function1>
  List(1,2,3,4) map increment                     //> res0: List[Int] = List(2, 3, 4, 5)
  val fun = ceil _                                //> fun  : Double => Double = <function1>
  fun(num)                                        //> res1: Double = 4.0
  
  Array(3,1.34,2,.0).map(fun)                     //> res2: Array[Double] = Array(3.0, 2.0, 2.0, 0.0)
  
  def mulBy(factor: Double) = (x: Double) => factor * x
                                                  //> mulBy: (factor: Double)Double => Double
  val byThree = mulBy(3)                          //> byThree  : Double => Double = <function1>
  
  val nine = byThree(3)                           //> nine  : Double = 9.0
  
  // (1 to 9).map("*" * _).foreach(println _)
  
 def mulOneAtATime(x: Int) = (y: Int) => x*y      //> mulOneAtATime: (x: Int)Int => Int
 
  mulOneAtATime(2)(4)                             //> res3: Int = 8
  
}