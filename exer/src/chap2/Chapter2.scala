package chap2

object Chapter2 extends App {

  def signum(num: Int) = {
    if (num > 0) 1
    else if (num < 0) -1
    num
  }
  
  println(signum(1))
  
  def loop  = {
    for (i <- 10 to (0, -1)) println(i)
  }
  
  println(s"\n$loop")
}