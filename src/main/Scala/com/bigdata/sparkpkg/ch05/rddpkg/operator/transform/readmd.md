## RDD

### 默认并行度

    backend.defaultParallelism() 
    spark.default.parallelism  默认并行度， 如果取不动，就使用 totalCores

### 分区

    slice切分
    postitions(lengtg, num) => tuple 

最小分区数量 math.min(defaultParallelism, 2)
分区数量的计算

1. 使用的Hadoop的分区规则

totalSize 7 goalSize = 7/2 = 3 byte

7/3 = 2 ... (1.1)

### 数据分区如何分配

1. 数据是以行的单位进行读取
2. spark读取文件，采用的是hadoop的读取，所以是一行一行读取，和字节数无关
3. 数据读取以偏移量为单位
4. 偏移量不会重复读取
5. 

1@@ => 012 2@@ => 345 3 => 6

0 => [0, 3]
1 => [3, 6]
2 => [6, 7]
    

### 转换
功能的补充和封装，将旧的RDD包装成新的RDD
flatMap
map




### 行动
触发任务的调度和作业的执行
collect


### RDD算子
认知心理学 
通过一系列的操作，状态改变

### value类型
map: 
def map[]


rdd的计算一个分区内的数据是一个一个执行逻辑
只有前一个数据全部完成的后，才会执行下一个数据
分区内的数据执行是有序的

不同分区数据计算是无序的


mappartitions
可以以分区为单位进行数据转换操作
但是会将整个分区的数据加载到内存进行引用
如果处理完的数据不会被释放掉， 存在对象引用
在内存小的情况下， 数据量大的场合下， 容易出现内存溢出的情况。




mapPartitionsWithIndex
索引编号


flatmap 函数是返回 iterators


glom
一个分区数据转换成一个数组


groupBy 
分组和分区没有必然关系的
会将数据打乱重新组合， shuffle


filter


sample 
是否放回
第一个参数，表示是否放回
第二个 每条数据被抽取的概率
第三个 随机数种子，如果不传，是当前系统时间
泊努力
泊松分布  


distinct
map.reduceby..

coalease
默认情况，不会将分区数据打乱组合
这种情况下，会出现数据不均衡，出现数据倾斜

第二个参数是 true shuffle

repartition
扩大分区，自动shuffle

sortBy
shuffle
根据指定规则进行排序，第二个参数是 降序还是升序

### 双value类型
交集
intersection

并集
union


差集
subtract

拉链
zip
分区数据量必须一致



### keyvalue类型

必须是 keyvalue类型  对偶元祖
隐式函数：二次编译
partitionBy(分区器)
根据指定的分区规则对数据进行重分区

PairRDDFuction

Spark默认就是Hashpartitioner

分区器相同(类型和数量)， 底层不会执行多次

Hashpartitioner
RangePartitioner

自定义分区器
 


reduceByKey
相同key的数据进行value的聚合处理
两两聚合
如果key只有一个，是不会参加运算的


groupByKey
相同的key放在一个组中，形成一个对偶元祖
groupBy() 指定key， iterator中放的是对偶元祖

会导致数据shuffle

spark中，shuffle操作必须落盘处理，不能在内存中数据等待，会导致内存溢出。
shuffle操作的性能不会太高。

reduceByKey
提前做数据预聚合 combine,
可以有效的减少shuffle时落盘的数据量

分区内
分区间


reduceByKey 
分区内和分区间计算规则是相同的。


存在函数柯里化
第一参数是 初始值
    用于第一个值的进行分区内计算
第二个参数列表需要传递两个参数
    1. 第一个参数是分区内计算规则
    2. 第二个参数是分区间计算规则
aggregateByKey()()
最终的结果和 初始值类型相同



如果分区间 分区间计算规则相同的情况下
foldByKey()() 


combineByKey()
第一个参数表示： 将相同的key的第一个数据进行结构转换实现操作
第二个参数 分区内
第三个参数表示分区间


join
相同key形成 tuple
会放大数据
多个相同的key， 会依次匹配， 可能出现笛卡尔乘积，会出现内存问题


leftouterjoin
rightouterjoin


cogroup connect group




### 行动算子


 





