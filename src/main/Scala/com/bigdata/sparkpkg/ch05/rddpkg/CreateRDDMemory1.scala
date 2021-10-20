package com.bigdata.sparkpkg.ch05.rddpkg

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


/**
 * override def getPartitions: Array[Partition] = {
 * val slices = ParallelCollectionRDD.slice(data, numSlices).toArray
 * slices.indices.map(i => new ParallelCollectionPartition(id, i, slices(i))).toArray
 * }
 *
 * def positions(length: Long, numSlices: Int): Iterator[(Int, Int)] = {
 * (0 until numSlices).iterator.map { i =>
 * val start = ((i * length) / numSlices).toInt
 * val end = (((i + 1) * length) / numSlices).toInt
 * (start, end)
 * }
 * }
 */
object CreateRDDMemory1 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    sparkconf.set("park.default.parallelism", "5")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 创建RDD
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
    // parallelize 并行
    //    scheduler.conf.getInt("spark.default.parallelism", totalCores)
    //    val rdd: RDD[Int] = sc.parallelize(ints)

    //   分区和并行度
    val rdd: RDD[Int] = sc.makeRDD(ints, 2)



    // parallelize(seq, numSlices)

    rdd.saveAsTextFile("output")

    sc.stop()
  }

}
