package com.bigdata.sparkpkg.ch05.sparkcore.test

import java.io.{ObjectOutputStream, OutputStream}
import java.net.{ServerSocket, Socket}

object Driver {
  def main(args: Array[String]): Unit = {

    val client: Socket = new Socket("localhost", 9999)
    val out1: OutputStream = client.getOutputStream
    val objout1: ObjectOutputStream = new ObjectOutputStream(out1)

    val task: Task = new Task()

    val subtask1: SubTask = new SubTask()
    subtask1.logic = task.logic
    subtask1.datas = task.datas.take(2)

    objout1.writeObject(subtask1)
    objout1.flush()
    objout1.close()
    client.close()


    val client2: Socket = new Socket("localhost", 8888)
    val out2: OutputStream = client2.getOutputStream

    val objout2: ObjectOutputStream = new ObjectOutputStream(out2)

    val subtask2: SubTask = new SubTask()
    subtask2.logic = task.logic
    subtask2.datas = task.datas.takeRight(2)

    objout2.writeObject(subtask2)
    objout2.flush()
    objout2.close()
    client2.close()

    println("数据发送完毕")

  }

}
