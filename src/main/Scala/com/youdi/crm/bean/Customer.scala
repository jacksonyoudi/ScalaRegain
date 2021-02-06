package com.youdi.crm.bean

class Customer {
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email: String = _


  // 先辅助构造器

  def this(id: Int, name: String, gender: Char, age: Short, tel: String) {
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }
}
