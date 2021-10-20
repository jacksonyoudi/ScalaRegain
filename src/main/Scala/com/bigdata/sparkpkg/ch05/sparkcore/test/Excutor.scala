package com.bigdata.sparkpkg.ch05.sparkcore.test

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object Excutor {
  def main(args: Array[String]): Unit = {
    val server: ServerSocket = new ServerSocket(9999)

    // 等待客户端链接

    println("服务器启动，等待连接")
    val client: Socket = server.accept()

    val in: InputStream = client.getInputStream


    val objectInputStream: ObjectInputStream = new ObjectInputStream(in)
    val task: SubTask = objectInputStream.readObject().asInstanceOf[SubTask]
    val ints: List[Int] = task.compute()
    println("[9999]计算结果：" + ints)

    objectInputStream.close()
    in.close()
    client.close()
    server.close()

  }

}
