package com.graph

import org.apache.spark.graphx.{Edge, Graph, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{Column, DataFrame, Row, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}


class Two {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("save")
    val sc: SparkContext = new SparkContext(conf)
    val session: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    val rdd: RDD[Row] = session.sql("text").rdd

    // 顶点  item_di, units
    val vertexRDD: RDD[(VertexId, Double)] = rdd.map(data => (data.getLong(0), data.getDouble(1)))

    // 边  item_id item_id 匹配度
    val edgeRDD: RDD[Edge[VertexId]] = rdd.map(d => Edge(d.getLong(0), d.getLong(2), d.getLong(3)))

    val graph: Graph[Double, VertexId] = Graph(vertexRDD, edgeRDD)

    val array: Array[(VertexId, Double)] = graph.vertices.sortByKey(false).top(20)

  }
}
