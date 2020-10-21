package main.com.zw.demo;

import java.io.*;
import java.net.Socket;

public class SocketClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我是客户端，发送消息\n");
            bufferedWriter.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverLine = bufferedReader.readLine();
            System.out.println(serverLine);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
