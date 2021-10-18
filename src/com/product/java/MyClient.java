package com.product.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO Auto-generated method stub
        Socket s=new Socket("120.25.123.151", 10002);
        //客户端启动ClientThread线程不断地从server读取数据
        new Thread(new ClientThread(s)).start();
        //获取该socket对应的输出流
        PrintStream ps=new PrintStream(s.getOutputStream());
        String line=null;
        //不断地读取键盘输入的信息
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while((line=br.readLine())!=null) {
            //将用户键盘输入的内容不断地输入到socket的输出流中
            ps.println(line);
        }
    }

}