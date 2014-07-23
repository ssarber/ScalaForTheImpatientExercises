package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(48); 
  

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(677); 
 
 /*
  def sqrtIter(guess: Double, x: Double): Double =
  	if (isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess, x), x)
  	
  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) < 0.01
  	
  def improve(guess: Double, x: Double) =
  	(guess + x / guess) / 2
  	
  def sqrt(x: Double) = sqrtIter(1.0, x)
 */
  
  
  def sqrt(x: Double) = {
  
 		def sqrtIter(guess: Double): Double =
  		if (isGoodEnough(guess)) guess
  		else sqrtIter(improve(guess))
  	
  	def isGoodEnough(guess: Double) =
  		abs(guess * guess - x) < 0.01
  	
  	def improve(guess: Double) =
  		(guess + x / guess) / 2
  		
  	def abs(x: Double) = if (x < 0) -x else x
  };System.out.println("""sqrt: (x: Double)Unit""")}
}
