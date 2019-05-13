package com.company.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        br.lines().forEach(System.out::println);

        char[] buff = new char[1024];
        StringBuilder builder = new StringBuilder();
        while (br.read(buff) != -1) {
            builder.append(buff);
        }
        System.out.println(builder.toString());

        OutputStreamWriter bw = (new OutputStreamWriter(os));
        bw.write("Hello client, it's server");
        bw.flush();

        socket.close();

        serverSocket.close();

    }
}
