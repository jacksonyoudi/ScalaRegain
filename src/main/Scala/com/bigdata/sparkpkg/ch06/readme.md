### 

reduceby spark底层做了优化，并且做了cache



join =>  union + reduce

broadcat + foreach

// 指定规则

sortWith(
)




### 工程化代码

#### 架构模式

MVC：
    - controller
    - model: data, logic
    - view: 

#### 三层架构
    * controller
        调度，
    * service
        服务层
    * DAO
        持久层



TreadLoacl 中缓存对象 
共享线程中数据问题
线程是不安全的
