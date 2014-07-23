package chap5



// 06
//class Person(private var _age: Int) {
//  if (_age < 0)
//    _age = 0
//    
//  def age = _age
//
//}
//object Main extends App {
//  val person = new Person(50)
//  
//  println(person.age)
//  
//  val person2 = new Person(-50)
//  
//  println(person2.age)
//}

/* 07. [Write a class Person with a primary constructor that accepts a string containing
a �rst name, a space, and a last name, such as new Person("Fred Smith"). Supply
read-only properties firstName and lastName. Should the primary constructor
parameter be a var, a val, or a plain parameter? Why?]
 */

//class Person (val name: String) {
//  val firstName = name.split(" ")(0)
//  val lastName = name.split(" ")(1)
//  
//}
//
//object Main extends App {
//  val muk = new Person("Muk Zek")
//  println(muk.name)
//  println(muk.firstName)
//}