package com.company.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket("localhost", 8081)) {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            OutputStreamWriter bw = (new OutputStreamWriter(os));
            bw.write("Hello server, it's client");
            bw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//            br.lines().forEach(System.out::println);

            char[] buff = new char[1024];
            StringBuilder builder = new StringBuilder();
            while (br.read(buff) != -1) {
                builder.append(buff);
            }
            System.out.println(builder.toString());

            System.out.println("done");

        }
    }

}
