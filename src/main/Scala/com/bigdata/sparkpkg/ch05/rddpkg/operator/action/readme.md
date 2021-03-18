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





