package com.youdi.ch17.rmi

import java.rmi.{Remote, RemoteException}

trait MyRemote extends Remote {

  @throws(classOf[RemoteException])
  def sayHello(): String
}
