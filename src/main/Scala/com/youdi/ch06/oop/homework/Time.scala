package com.youdi.ch06.oop.homework

class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Int = {
    if (this.hours > other.hours) {
      return -1
    } else if (this.hours < other.hours) {
      return 1
    } else if (this.minutes > other.minutes) {
      return -1
    } else if (this.minutes < other.minutes) {
      return 1
    } else {
      return 0
    }
  }
}
