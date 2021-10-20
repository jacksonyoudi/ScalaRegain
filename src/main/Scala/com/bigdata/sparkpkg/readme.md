## 数据倾斜


### 广播变量
- 只读
- driver blockmanager
- 序列化
- BT协议
- 可以被excutor中的多个task共享
- sparkSQL中广播变量缺省是10M
- jvm中的内存