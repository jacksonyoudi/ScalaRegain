### 提交

```bash
spark-submit 


exec "${SPARK_HOME}"/bin/spark-class org.apache.spark.deploy.SparkSubmit "$@"


```

spark-class

java 



```bash
java org.apache.spark.deploy.SparkSubmit

JVM => Process(SparkSubmit)

SparkSubmit main

jps

```


### 准备提交环境
```scala
val (childArgs, childClasspath, sparkConf, childMainClass) = prepareSubmitEnvironment(args)


if (isYarnCluster) {
  childMainClass = YARN_CLUSTER_SUBMIT_CLASS
  if (args.isPython) {
    childArgs += ("--primary-py-file", args.primaryResource)
    childArgs += ("--class", "org.apache.spark.deploy.PythonRunner")
  } else if (args.isR) {
    val mainFile = new Path(args.primaryResource).getName
    childArgs += ("--primary-r-file", mainFile)
    childArgs += ("--class", "org.apache.spark.deploy.RRunner")
  } else {
    if (args.primaryResource != SparkLauncher.NO_RESOURCE) {
      childArgs += ("--jar", args.primaryResource)
    }
    childArgs += ("--class", args.mainClass)
  }
  if (args.childArgs != null) {
    args.childArgs.foreach { arg => childArgs += ("--arg", arg) }
  }
}



private[deploy] val YARN_CLUSTER_SUBMIT_CLASS =
  "org.apache.spark.deploy.yarn.YarnClusterApplication"


private val yarnClient = YarnClient.createYarnClient


public static YarnClient createYarnClient() {
  YarnClient client = new YarnClientImpl();
  return client;
}


public YarnClientImpl() {
  super(YarnClientImpl.class.getName());
}


提交应用程序
this.appId = submitApplication()


run


create context

提交给 RM启动 Am
org.apache.spark.deploy.yarn.ApplicationMaster

org.apache.spark.deploy.yarn.ExecutorLauncher



runDriver()



userClassThread = startUserApplication()


val sc = ThreadUtils.awaitResult(sparkContextPromise.future,
  Duration(totalWaitTime, TimeUnit.MILLISECONDS))



注册am，申请资源
registerAM(host, port, userConf, sc.ui.map(_.webUrl), appAttemptId)


handleAllocatedContainers

runAllocatedContainers


prepareCommand

启动容器

org.apache.spark.executor.YarnCoarseGrainedExecutorBackend


```

applicationmaster是进程
driver是am中的一个线程







移动数据不如移动计算

本地化级别

进程本地化：  数据和计算在同一个进程中
节点本地化： 数据和计算在同一个节点中
机架本地化： 数据和计算在同一机架中
任意




## 内存管理

栈
堆 
    新生代
    老年代
方法区




spark内存 (excutor)

存储内存 (30%)
    * 缓存数据
    * 广播变量

执行内存 (30%)
    * shuffle过程中的操作
    
其他内存 (40%)
    系统， rdd元数据的信息

预留内存
    固定 300m

### 统一内存管理










