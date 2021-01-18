package com.youdi.ch06.oop.abstractmethod

class BankAccount(inAccount: String, inBalance: Double, inPwd: String) {
  val account: String = inAccount
  var balance: Double = inBalance
  var pwd: String = inPwd


  def query(pwd: String): Unit = {
    if (this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    printf("余额是%f", this.balance)
  }

  def withDraw(pwd: String, money: Double): Any = {
    if (this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }

    if (this.balance < money) {
      println("余额不足")
      return
    }

    this.balance -= money
    money
  }
}
