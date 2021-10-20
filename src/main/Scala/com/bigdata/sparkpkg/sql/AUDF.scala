package com.bigdata.sparkpkg.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, Encoder, Row, SparkSession, functions}
import org.apache.spark.sql.expressions.{Aggregator, MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types.{DataType, StructType}

object AUDF {
  def main(args: Array[String]): Unit = {

    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark sql udaf")
    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    import spark.implicits._


    val df: DataFrame = spark.read.json("/Users/youdi/project/javaproject/ScalaRegain/src/main/resources/hello.txt")
    df.printSchema()


    df.createOrReplaceTempView("user")

    spark.udf.register("pre", (name: String) => {
      "hello:" + name
    })

    // 注册
    spark.udf.register("pre", functions.udaf(new MYAvgUDAF()))

    spark.sql("select pre(name) from user").show()
    spark.close()

  }

}


class MyAvgUADF extends UserDefinedAggregateFunction {
  override def inputSchema: StructType = ???

  override def bufferSchema: StructType = ???

  override def dataType: DataType = ???

  override def deterministic: Boolean = ???

  override def initialize(buffer: MutableAggregationBuffer): Unit = ???

  override def update(buffer: MutableAggregationBuffer, input: Row): Unit = ???

  override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = ???

  override def evaluate(buffer: Row): Any = ???
}


//
class  MYAvgUDAF extends Aggregator {
  override def zero: Nothing = ???

  override def reduce(b: Nothing, a: Any): Nothing = ???

  override def merge(b1: Nothing, b2: Nothing): Nothing = ???

  override def finish(reduction: Nothing): Nothing = ???

  override def bufferEncoder: Encoder[Nothing] = ???

  override def outputEncoder: Encoder[Nothing] = ???
}