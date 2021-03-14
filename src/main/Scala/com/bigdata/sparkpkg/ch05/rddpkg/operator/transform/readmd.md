## RDD

### 默认并行度
    backend.defaultParallelism() 
    spark.default.parallelism  默认并行度， 如果取不动，就使用 totalCores

### 分区
    slice切分
    postitions(lengtg, num) => tuple 

最小分区数量
math.min(defaultParallelism, 2)
分区数量的计算
1. 使用的Hadoop的分区规则


totalSize 7 
goalSize = 7/2 = 3 byte

7/3 = 2 ... (1.1)