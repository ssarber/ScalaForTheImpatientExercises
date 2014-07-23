package chap8

class BankAccount(initialBalance: Double)  {
  protected var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }

}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def deposit (amount: Double) = super.deposit(amount - 1.0)
  override def withdraw (amount: Double) = super.withdraw(amount - 1.0)
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
	
	var transactions = 0

  override def deposit (amount: Double) = {
    transactions += 1
    if (transactions <= 3) super.deposit(amount)
    else {

      super.deposit(amount - 1.0)

    }
    
  }
  def earnMonthlyInterest(interest: Double) = {
    transactions = 0
    balance * interest
    balance
  }
}

object m extends App {
  var sav = new SavingsAccount(100.00)
  println(sav.deposit(100))
  println(sav.deposit(100))
  println(sav.deposit(100))
  println(sav.deposit(100))
  println(sav.transactions)
  sav.earnMonthlyInterest(0.05)
  println(sav.transactions)
  println(sav.deposit(100))

}