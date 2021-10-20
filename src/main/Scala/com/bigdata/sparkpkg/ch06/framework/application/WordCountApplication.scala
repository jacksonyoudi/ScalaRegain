package com.bigdata.sparkpkg.ch06.framework.application

import com.bigdata.sparkpkg.ch06.framework.common.TApplication
import com.bigdata.sparkpkg.ch06.framework.controller.WordCountController

object WordCountApplication extends App with TApplication {
  start("local[*]", "wordcount") {
    val controller: WordCountController = new WordCountController
    controller.dispatch()
  }
}
