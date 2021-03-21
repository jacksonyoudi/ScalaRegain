package com.bigdata.sparkpkg.ch06.framework.util

import org.apache.spark.SparkContext

object EvnUtil {
  //  private val scLocal

  private val scLocal: ThreadLocal[SparkContext] = new ThreadLocal[SparkContext]()


  def put(sc: SparkContext): Unit = {
    scLocal.set(sc)
  }

  def take(): SparkContext = {
    scLocal.get()
  }

  def clear(): Unit = {
    scLocal.remove()
  }

}
