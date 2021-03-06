package com.youdi.ch17.observer.loalinternet

class WeatherData {
  private var mTemperature: Float = _
  private var mPressure: Float = _
  private var mHumidity: Float = _
  private var mCurrentCondition: CurrentCondition = _


  def this(mCurrentCondition: CurrentCondition) {
    this()
    this.mCurrentCondition = mCurrentCondition
  }

  def getTemperature(): Float = mTemperature

  def getmPressure(): Float = mPressure

  def getmHumidity(): Float = mHumidity

  def getmCurrentCondition(): CurrentCondition = mCurrentCondition
}
