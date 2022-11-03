package com.graph.simple

import org.apache.spark.graphx.{Edge, Graph, VertexId, VertexRDD}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object One {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName(this.getClass.getName)
    // 采用
    //      .set("spark.serializer", "org.apache.serializer.KryoSerializer")

    val sc: SparkContext = new SparkContext(conf)

    // 构建点的集合 点id, 属性
    val persons: RDD[(Long, (String, String))] = sc.makeRDD(Seq((3L, ("rxin", "student")), (7L, ("jgonzal", "postdoc")),
      (5L, ("franklin", "prof")), (2L, ("istoica", "prof"))))

    // 构建边的集合
    val relationships: RDD[Edge[String]] = sc.parallelize(Seq(Edge(3L, 7L, "collab"), Edge(5L, 3L, "advisor"),
      Edge(2L, 5L, "colleague"), Edge(5L, 7L, "pi")))

    val graph: Graph[(String, String), String] = Graph(persons, relationships)

    //    val vertices: VertexRDD[(String, String)] = graph.vertices
    // 取出顶点
    // 计算出顶点ID， 最小值为顶点
    val vertices1: VertexRDD[VertexId] = graph.connectedComponents().vertices
    vertices1.foreach(println)

  }

}
