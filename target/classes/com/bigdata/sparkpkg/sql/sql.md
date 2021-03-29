### DataFrame
df比rdd性能高， sql优化

spark catalyst optimiser

更关注结构


### 全局临时表
global_tmp.xxx


### DSL 
domain-specific langage


df.printSchema


```sparksql
df.select("age").show
df.select($"age" + 1).show

df.select('age + 1).show

df.select('age, 'username)



df.filter('age > 20).show
df.groupBy("age").show()


```

### RDD -> DataFrame

```scala
df = rdd.toDF("id")
df.printSchema


行
df.rdd (Row)
```


### DataSet

使用样例类
```scala
case class Emp(id:Long, username:String)
 
ds = df.as[Emp]



rdd必须是case clas就可以了
rdd.toDs[]

```



### spark sql 
内置hive

外置hive

1. 将hive-site.xml copy到  spark的conf中
2. jars中加上 mysql的驱动
3. 如果访问不到hdfs， 则需要把core-site.xml和hdfs-site.xml拷贝到conf目录下
4. 重启spark-shell


