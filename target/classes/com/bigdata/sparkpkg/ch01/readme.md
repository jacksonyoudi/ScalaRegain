## Hadoop与Spark

一次性数据计算
框架在处理数据的时候，会从存储设备中读取数据，进行逻辑操作，然后将处理的结果重新存储到介质中

file -> mapper -> data -> reducer -> file

不能进行迭代计算， 
进行磁盘交互


spark将作业结果保存在内存中。


spark和hadoop的根本差异是多个作业之间的数据通信问题: spark多个作业之间数据通信是内存， 而hadoop是基于磁盘的。



### spark组成

spark sql spark stream  spark ML spark granph x
spark core
