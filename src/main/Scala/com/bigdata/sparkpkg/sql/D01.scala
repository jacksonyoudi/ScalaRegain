package com.bigdata.sparkpkg.sql

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

object D01 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark sql")
    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    import spark.implicits._


    val df: DataFrame = spark.read.json("/Users/youdi/project/javaproject/ScalaRegain/src/main/resources/hello.txt")
    df.printSchema()

    df.select("id").show()
    df.select($"id").show()
    df.select('id).show()


    // dataset
    // dataframe是一种特定类型的 dataset

    val rdd: RDD[(Int, String, Int)] = spark.sparkContext.makeRDD(List((1, "one", 30), (2, "two", 40)))

    val df1: DataFrame = rdd.toDF("id", "name", "age")
    val rdd1: RDD[Row] = df1.rdd

    val ds: Dataset[User] = df1.as[User]
    val frame: DataFrame = ds.toDF()


    val ds3: Dataset[User] = rdd.map {
      case (id, name, age) => {
        User(id, name, age)
      }
    }.toDS()

    ds3.rdd



    spark.close()
  }


  case class User(id: Int, name: String, age: Int)

}
