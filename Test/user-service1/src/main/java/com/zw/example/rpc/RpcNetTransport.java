package main.java.com.zw.example.rpc;

import java.io.IOException;
import java.net.Socket;

public class RpcNetTransport {
    private String host;
    private int port;

    public RpcNetTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Socket newSocket() throws IOException {
        return new Socket(host, port);
    }
//    public Object send(RpcRequest request) {
//
//    }
}
