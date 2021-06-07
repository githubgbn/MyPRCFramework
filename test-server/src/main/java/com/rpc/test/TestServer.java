package com.rpc.test;

import com.rpc.api.HelloService;
import com.rpc.server.RpcServer;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 8888);
    }
}
