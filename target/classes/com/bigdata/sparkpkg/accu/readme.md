### 累加器
excutor计算的结果，会发送给driver，diever最后会进行聚合
分布式共享只写变量

### 类型
Long
collect
double


### 问题

少加： 转换算子中调用累加器，如果没有行动算子，那就不会执行，不会触发
多加： 行动算子多次执行， 就会多加，可以使用cache和放在行动算子中


