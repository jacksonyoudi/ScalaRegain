###  行动算子

所谓行动算子，其实就是触发作业的执行的方法

底层代码调用的就是环境对象的 sc.runjob方法 创建一个作业 ActiveJob， 并提交执行


reduce
直接出结果


collection
将不同分区的数据按照采集顺序到driver

count()


first()

take() 获取n个数据


takeOrder() 
排序后的数据，取n个数据


aggregate()  初始值参数分区间和分区内计算
aggregateByKey 初始值只是参与分区内计算

fold() 
aggregate分区内和分区间计算规则一样的时候




countByValue()
表示 值出现的次数

countByKey()





### save相关算子

saveAsTextFile()
saveAsObjectFile()

saveAsSequenceFile()
数据必须是kv类型



collect().foreach() 在driver端执行
foreach() 在excutor端执行的



RDD的方法和scala集合对象的方法不一样
集合对象的方法都是在同一个节点的内存中完成的
RDD的方法可以将计算逻辑发送到Excutor端(分布式节点)执行的
为了区分不同的处理效果，所以将RDD的方法称之为算子


RDD的方法外部的操作都是在Driver端执行的，而方法内部逻辑代码是在excutor中执行的



样例类自动混入 序列化接口

RDD算子中，传递的函数中会包含闭包，那么就会进行执行检测功能

闭包检测


类的构造参数是类的属性，构造参数需要进行闭包检测， 其实就是等于类进行闭包


### 血缘关系
RDD之间的相互依赖关系

每个RDD都会保存祖先的血缘关系
RDD为了容错，需要将RDD之间的关系保存下来
一旦出现了错误，可以根据血缘关系将数据源重新读取进行计算。



todebugString: 可以打印出血缘关系
dependencies: 可以打印相邻的依赖关系
    onetoone (窄依赖)
    shuffle依赖 打乱重组
数据的依赖

RDD阶段划分
createResultStage
一个shuffledependshuffle， 就会创建一个阶段

阶段数量  = shuffle依赖的数量 + 1
resultStage只有一个， 最后执行阶段


RDD任务划分：
Application
    初始化一个SparkContext就生成一个Application

Job：
    一个action算子就会生成一个Job

Stage: stage等于shuffleDependency的个数加1

Task： 一个stage阶段中， 最后一个RDD的分区个数就是task的个数。 

App李cation -> job -> stage -> Task 1对n



shuffleMapStage => shuffleMapTask

ResultStage => ResultTask




### RDD持久化 
* RDD不存储数据
* 一个RDD需要重用，RDD对象可以重用， 但是数据不能重用，数据需要重头读取使用
* 如果链路比较长的时候， 可以使用持久化， 为了恢复数据。


cache 持久化到内存中
persist()  可以选择级别 保存到临时文件的

注意： 持久化只有在action算子的时候，才会进行缓存

```scala
  val NONE = new StorageLevel(false, false, false, false)
  val DISK_ONLY = new StorageLevel(true, false, false, false)
  val DISK_ONLY_2 = new StorageLevel(true, false, false, false, 2)
  val MEMORY_ONLY = new StorageLevel(false, true, false, true)
  val MEMORY_ONLY_2 = new StorageLevel(false, true, false, true, 2)
  val MEMORY_ONLY_SER = new StorageLevel(false, true, false, false)
  val MEMORY_ONLY_SER_2 = new StorageLevel(false, true, false, false, 2)
  val MEMORY_AND_DISK = new StorageLevel(true, true, false, true)
  val MEMORY_AND_DISK_2 = new StorageLevel(true, true, false, true, 2)
  val MEMORY_AND_DISK_SER = new StorageLevel(true, true, false, false)
  val MEMORY_AND_DISK_SER_2 = new StorageLevel(true, true, false, false, 2)
  val OFF_HEAP = new StorageLevel(true, true, true, false, 1)
```


### checkpoint
需要落盘
需要指定到保存路径
检查点路径保存的文件，当程序执行完毕后，不会被删除


### 不同
cache： 将数据临时存储在内存中进行数据重用
persist: 将数据临时存储在文件系统上，涉及到IO,性能低，但是数据安全
 作业完成后，临时文件会被删除的
会在血缘关系中，添加一段 cache的， 如果任务失败，可以重头读取数据


checkpoint： 将数据长久保存在磁盘文件中进行数据重用涉及到磁盘IO性能较低， 但是数据安全
为了保证数据安全，所有一本情况下，会独立执行作业，为了能够提高作业，会和cache联合使用的
先cache，再做checkpoint也可以提高效率的。checkpoint() 直接从cache中拿数据
执行过程汇总，会切断血缘关系，重新建立新的血缘关系。
等同数据源发生了改变。



### RDD分区器
hashPartitioner












