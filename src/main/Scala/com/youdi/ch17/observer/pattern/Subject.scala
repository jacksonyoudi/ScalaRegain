package com.youdi.ch17.observer.pattern


trait Subject {
  def registerObserver(o: Observer)

  def removeObserver(o: Observer)

  def notifyObservers()

}
