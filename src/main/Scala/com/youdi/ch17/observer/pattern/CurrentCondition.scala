package com.youdi.ch17.observer.pattern


class CurrentCondition extends Observer {
  private var m: Float = _
  private var p: Float = _
  private var h: Float = _


  def display() = {
    println(m, p, h)
  }

  override def update(m: Float, p: Float, h: Float): Unit = {
    this.m = m
    this.p = p
    this.h = h

    display()
  }
}
