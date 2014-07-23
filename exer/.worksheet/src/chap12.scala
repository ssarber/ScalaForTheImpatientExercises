object chap12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")
  import scala.math._;$skip(39); 
  val num = 3.14;System.out.println("""num  : Double = """ + $show(num ));$skip(36); 
  val increment = (x: Int) => x + 1;System.out.println("""increment  : Int => Int = """ + $show(increment ));$skip(30); val res$0 = 
  List(1,2,3,4) map increment;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(19); 
  val fun = ceil _;System.out.println("""fun  : Double => Double = """ + $show(fun ));$skip(11); val res$1 = 
  fun(num);System.out.println("""res1: Double = """ + $show(res$1));$skip(33); val res$2 = 
  
  Array(3,1.34,2,.0).map(fun);System.out.println("""res2: Array[Double] = """ + $show(res$2));$skip(59); 
  
  def mulBy(factor: Double) = (x: Double) => factor * x;System.out.println("""mulBy: (factor: Double)Double => Double""");$skip(25); 
  val byThree = mulBy(3);System.out.println("""byThree  : Double => Double = """ + $show(byThree ));$skip(27); 
  
  val nine = byThree(3);System.out.println("""nine  : Double = """ + $show(nine ));$skip(97); 
  
  // (1 to 9).map("*" * _).foreach(println _)
  
 def mulOneAtATime(x: Int) = (y: Int) => x*y;System.out.println("""mulOneAtATime: (x: Int)Int => Int""");$skip(24); val res$3 = 
 
  mulOneAtATime(2)(4);System.out.println("""res3: Int = """ + $show(res$3))}
  
}
