### 环境

### local

spark-submit 
--class xxx.xx
--master local[*]
xx.jar

### 集群模式
Standalone

--master spark://xxx:7077

高可用的

--master spark://xxx:7077,spark://xxx2:7077


### yarn

--master yarn
-- deploy-mode client

-- deploy-mode cluster




