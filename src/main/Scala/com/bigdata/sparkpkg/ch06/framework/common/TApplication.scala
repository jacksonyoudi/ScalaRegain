package com.bigdata.sparkpkg.ch06.framework.common

import com.bigdata.sparkpkg.ch06.framework.controller.WordCountController
import com.bigdata.sparkpkg.ch06.framework.util.EvnUtil
import org.apache.spark.{SparkConf, SparkContext}

trait TApplication {

  // 控制抽象
  def start(master: String = "local[*]", app: String = "App")(op: => Unit): Unit = {
    val conf: SparkConf = new SparkConf().setMaster(master).setAppName(app)
    val sc: SparkContext = new SparkContext(conf)
    EvnUtil.put(sc)
    try {
      op
    } catch {
      case ex => ex.printStackTrace()
    }

    sc.stop()
    EvnUtil.clear()
  }


}
