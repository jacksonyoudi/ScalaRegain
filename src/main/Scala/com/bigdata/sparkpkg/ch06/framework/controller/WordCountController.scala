package com.bigdata.sparkpkg.ch06.framework.controller

import com.bigdata.sparkpkg.ch06.framework.common.Tcontroller
import com.bigdata.sparkpkg.ch06.framework.service.WordCountService

class WordCountController extends Tcontroller {
  private val wordCountService = new WordCountService
  
  def dispatch(): Unit = {

    val array: Array[(String, Int)] = wordCountService.dataAnalysis()
    array.foreach(print)
  }

}