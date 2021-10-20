package com.youdi.ch17.observer.pattern

import java.util.Observable

object Demo {
  def main(args: Array[String]): Unit = {
    val st: WeatherDataSt = new WeatherDataSt()
    val condition: CurrentCondition = new CurrentCondition()
    st.registerObserver(condition)
    st.setData(1, 2, 3)

    st.removeObserver(condition)
    st.setData(4, 5, 6)

    st.registerObserver(condition)

    st.setData(7, 8, 9)

  }
}
