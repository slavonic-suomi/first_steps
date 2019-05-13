package com.company.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetworkMain {
    public static void main(String[] args) throws IOException {
        InetAddress address =
                InetAddress.getByName("google.com");

        System.out.println(address);

        try (Socket socket = new Socket(address, 80)) {
            InputStream  is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            PrintWriter bw = new PrintWriter(new OutputStreamWriter(os));
            bw.println("GET / HTTP/1.0");
            bw.println();
            bw.flush();



            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            char[] buff = new char[1024];
            StringBuilder builder = new StringBuilder();
            while (br.read(buff) != -1) {
                builder.append(buff);
            }
            System.out.println(builder.toString());

//            br.lines().forEach(System.out::println);

        }
    }
}
