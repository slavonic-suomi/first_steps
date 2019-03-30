package com.company.main;

import com.company.generics.model.Phone;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class IOMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        InputStream in = System.in;
//        byte[] buff = new byte[100];
//
//        OutputStream os = System.out;
////        os.p
//
//        Reader reader = new InputStreamReader(in);
//
//        Writer writer = new OutputStreamWriter(os);


        Phone phone = new Phone();
        phone.setDisplay(1);
        phone.setPrice(123);

        File file = new File("in.bin");

//        file.createNewFile();
//        System.out.println(file.exists());

//        FileInputStream fis = new FileInputStream(file);
//        InputStreamReader reader = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(reader);

//        Scanner scanner = new Scanner(file);
//
//        int i = scanner.nextInt();
//        scanner.nextLine();
//        String s = scanner.nextLine();
//        System.out.println(i);
//        System.out.println(s);
//        System.out.println("11");

//        FileWriter writer = new FileWriter(file);
//        writer.write(phone.toString());
//        writer.close();

//        FileOutputStream fos = new FileOutputStream(file);
//        int price = phone.getPrice();
//        int display = phone.getDisplay();
//        byte[] b = {
//                (byte) ((byte) price >>> 24),
//                (byte) ((byte) price >>> 16),
//                (byte) ((byte) price >>> 8),
//                (byte) price,
//                (byte) ((byte) display >>> 24),
//                (byte) ((byte) display >>> 16),
//                (byte) ((byte) display >>> 8),
//                (byte) display,
//        };
//
//        fos.write(b);
//        fos.close();

//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(phone);
//
//        oos.close();
//        fos.close();

        FileInputStream in = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(in);

        Phone o = (Phone) ois.readObject();

        System.out.println(o);

        ois.close();
        in.close();


    }
}
