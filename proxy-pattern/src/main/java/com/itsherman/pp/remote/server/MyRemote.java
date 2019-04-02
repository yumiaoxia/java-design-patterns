package com.itsherman.pp.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public interface MyRemote extends Remote {

    /**
     *远程方法的变量和返回值，必须属于原语类型或者可序列化类型
     * @return
     * @throws RemoteException
     */
    public String sayHello() throws RemoteException;
}
