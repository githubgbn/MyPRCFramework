package com.rpc.test;

import com.rpc.api.HelloObject;
import com.rpc.api.HelloService;
import com.rpc.client.RpcClientProxy;

public class TestClient {

    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy("127.0.0.1", 8888);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
