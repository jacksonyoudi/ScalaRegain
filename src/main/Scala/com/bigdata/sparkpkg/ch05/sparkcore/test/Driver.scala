package com.bigdata.sparkpkg.ch05.sparkcore.test

import java.io.{ObjectOutputStream, OutputStream}
import java.net.{ServerSocket, Socket}

object Driver {
  def main(args: Array[String]): Unit = {

    val client: Socket = new Socket("localhost", 9999)
    val out: OutputStream = client.getOutputStream

    val objout: ObjectOutputStream = new ObjectOutputStream(out)

    val task: Task = new Task()
    objout.writeObject(task)
    objout.flush()
    objout.close()

    client.close()
    println("数据发送完毕")

  }

}
