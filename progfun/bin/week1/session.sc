package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
 
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
  }                                               //> sqrt: (x: Double)Unit
}