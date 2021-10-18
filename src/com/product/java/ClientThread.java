package com.product.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {

    private Socket s;
    BufferedReader br;

    public ClientThread(Socket s) throws IOException {
        // TODO Auto-generated constructor stub
        this.s=s;
        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    }


    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            String context=null;
            while((context=br.readLine())!=null) {
                System.out.println(context);
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}