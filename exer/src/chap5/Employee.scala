package chap5

class Employee(var _name: String = "John Q. Public", var _salary: Double = 0.0 ) {
  def salary = _salary
  def name = _name
  def name_=(aName: String) { _name = aName }

}

object Puk extends App {
  
  val e = new Employee("Aston Martin", 444)
//  e.name = "kdsdk"
  println(e.name)
}