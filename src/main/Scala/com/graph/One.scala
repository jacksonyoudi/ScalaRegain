package com.graph

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.graphx.{Edge, Graph, VertexId}
import org.apache.spark.rdd.RDD


class One {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("save")
    val sc: SparkContext = new SparkContext(conf)
    val session: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    val df: DataFrame = session.sql("text")

    sc.setLogLevel("warn")

    val vertexArray: Array[(Long, String)] = Array((1L, "SFO"), (2L, "ORD"), (3L, "DFW"))

    val edgeArray: Array[Edge[Int]] = Array(
      Edge(1L, 2L, 1800),
      Edge(2L, 3L, 800),
      Edge(3L, 1L, 1400)
    )

    //构造vertexRDD和edgeRDD
    val vertexRDD: RDD[(VertexId, String)] = sc.makeRDD(vertexArray)
    val edgeRDD: RDD[Edge[Int]] = sc.makeRDD(edgeArray)


    //构造图
    val graph: Graph[String, Int] = Graph(vertexRDD, edgeRDD)


    graph.vertices.foreach(println)


    graph.edges.foreach(println)


  }
}
