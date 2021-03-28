package com.bigdata.sparkpkg.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object HiveD01 {
  def main(args: Array[String]): Unit = {
    System.setProperty("HADOOP_USER_NAME", "root")


    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark sql hive")
    val spark: SparkSession = SparkSession.builder().enableHiveSupport().config(conf).getOrCreate()

    // spark使用外置hive
    // 如何判断是否有， target中有 hive-site.xml
    spark.sql("show tables").show()


    spark.close()
  }

}
