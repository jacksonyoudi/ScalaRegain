package com.graph

import org.apache.spark.graphx.{Edge, Graph, VertexId, VertexRDD}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Three {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName(this.getClass.getName)
    // 采用
    //      .set("spark.serializer", "org.apache.serializer.KryoSerializer")

    val sc: SparkContext = new SparkContext(conf)


    // RDD[(VertexId, VertexId)]
    val rawRDD: RDD[(VertexId, VertexId)] = sc
      .textFile("xxx")
      .filter(s => s != "0, 0")
      .repartition(numPartitions = 10)
      .map {
        s => {
          val words: Array[String] = s.split(",")
          val src: VertexId = words(0).toLong
          val dst: VertexId = words(1).toLong
          if (src < dst) {
            (src, dst)
          } else {
            (dst, src)
          }
        }
      }
      .distinct()


    val gh: Graph[Int, Int] = Graph.fromEdgeTuples(rawRDD, 1)

    val edgeRDD: RDD[Edge[Int]] = gh.edges.map(p => Edge(p.dstId, p.srcId, 1))


    sc.stop()


  }
}
