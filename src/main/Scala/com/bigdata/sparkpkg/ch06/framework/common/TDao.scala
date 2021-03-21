package com.bigdata.sparkpkg.ch06.framework.common

import com.bigdata.sparkpkg.ch06.framework.util.EvnUtil

trait TDao {
  def readFile(path: String): Any = {
    EvnUtil.take().textFile(path)
  }

}
