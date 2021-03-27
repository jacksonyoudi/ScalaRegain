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
```