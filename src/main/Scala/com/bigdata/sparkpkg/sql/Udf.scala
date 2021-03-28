package com.bigdata.sparkpkg.sql

import com.bigdata.sparkpkg.sql.D01.User
import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object Udf {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark sql")
    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    import spark.implicits._


    val df: DataFrame = spark.read.json("/Users/youdi/project/javaproject/ScalaRegain/src/main/resources/hello.txt")
    df.printSchema()


    df.createOrReplaceTempView("user")

    spark.udf.register("pre", (name: String) => {
      "hello:" + name
    })

    spark.sql("select pre(name) from user").show()
    spark.close()
  }

}
