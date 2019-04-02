package com.itsherman.pp.remote.client;

import com.itsherman.pp.remote.server.MyRemote;

import java.rmi.Naming;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class MyRemoteClient {

    public static void main(String[] args) {
            new MyRemoteClient().go();
    }

    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
