package com.youdi.ch17.observer.pattern

import scala.collection.mutable.ListBuffer

class WeatherDataSt extends Subject {
  private var m: Float = _
  private var p: Float = _
  private var h: Float = _

  private val mObservers: ListBuffer[Observer] = ListBuffer[Observer]()


  def getM(): Float = m

  def getP(): Float = p

  def geth(): Float = h


  override def registerObserver(o: Observer): Unit = {
    if (!mObservers.contains(o)) {
      this.mObservers.append(o)
    }

  }

  override def removeObserver(o: Observer): Unit = {
    if (mObservers.contains(o)) {
      mObservers -= o
    }
  }


  override def notifyObservers(): Unit = {
    for (elem <- mObservers) {
      elem.update(m, p, h)
    }
  }


  def dataChange(): Unit = {
    notifyObservers()
  }


  def setData(m: Float, p: Float, h: Float): Unit = {
    this.m = m
    this.h = h
    this.p = p

    dataChange()

  }
}
