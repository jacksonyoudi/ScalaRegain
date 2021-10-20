package com.youdi.ch17.rmi

import java.rmi.registry.LocateRegistry
import java.rmi.{Naming, RemoteException}
import java.rmi.server.UnicastRemoteObject

class MyRemoteIml extends UnicastRemoteObject with MyRemote {

  @throws(classOf[RemoteException])
  override def sayHello(): String = {
    "hello world"
  }
}


object MyRemoteIml {
  def main(args: Array[String]): Unit = {
    val iml: MyRemoteIml = new MyRemoteIml()

    //    LocateRegistry.createRegistry(9876)
    //    Naming.rebind("remotehello", iml)
    Naming.rebind("rmi://127.0.0.1:98765/remotehello", iml)
    println("开启")

  }
}