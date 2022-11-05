package com.graph

import org.apache.spark.graphx.{Edge, Graph, VertexId, VertexRDD}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Four {

  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName(this.getClass.getName)
    //      .set("spark.serializer", "org.apache.serializer.KryoSerializer")

    val sc: SparkContext = new SparkContext(conf)

    val rdd1: RDD[(Long, (String, Int))] = sc.makeRDD(
      Seq(
        (1L, ("zhangsan", 22)),
        (2L, ("li", 22)),
        (6L, ("6", 22)),
        (9L, ("9", 22)),
        (133L, ("133", 22)),
        (16L, ("16L", 188)),
        (21L, ("21L", 21)),
        (44L, ("44L", 22)),
        (158L, ("158L", 22)),
        (5L, ("5L", 22)),
        (7L, ("7L", 22))))


    val rdd2: RDD[Edge[Int]] = sc.makeRDD(
      Seq(
        Edge(1L, 133L, 0),
        Edge(2L, 133L, 0),
        Edge(6L, 133L, 0),
        Edge(9L, 133L, 0),
        Edge(6L, 138L, 0),
        Edge(21L, 138L, 0),
        Edge(44L, 138L, 0),
        Edge(16L, 138L, 0),
        Edge(5L, 158L, 0),
        Edge(7L, 158L, 0)
      )
    )

    val graph: Graph[(String, Int), Int] = Graph(rdd1, rdd2)


    // Compute the connected component membership of each vertex
    // and return a graph with the vertex value containing the lowest vertex id
    // in the connected component containing that vertex.
    val vertices: VertexRDD[VertexId] = graph.connectedComponents().vertices
//    vertices.foreach(println)

    vertices.join(rdd1).map {
      case (userid, (cmid, (name, age))) => (cmid, List((name, age)))
    }.reduceByKey(_ ++ _).foreach(println)


    graph.mapVertices()

    sc.stop()


  }
}
