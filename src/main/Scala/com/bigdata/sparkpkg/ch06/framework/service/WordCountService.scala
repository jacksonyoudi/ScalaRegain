package com.bigdata.sparkpkg.ch06.framework.service

import com.bigdata.sparkpkg.ch06.framework.common.TService
import com.bigdata.sparkpkg.ch06.framework.dao.WordCountDao
import org.apache.spark.rdd.RDD

class WordCountService extends TService {
  private val wordCountDao = new WordCountDao

  def dataAnalysis(): Array[(String, Int)] = {

    val lines: RDD[String] = wordCountDao.readFile("/Users/youdi/project/javaproject/ScalaRegain/src/main/resources/hello.txt").asInstanceOf[RDD[String]]
    val words: RDD[String] = lines.flatMap(_.split(" "))
    val mapOne: RDD[(String, Int)] = words.map((_, 1))
    val ws: RDD[(String, Int)] = mapOne.reduceByKey(_ + _)

    ws.collect()
  }
}
