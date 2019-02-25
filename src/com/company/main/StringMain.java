package com.company.main;

public class StringMain {
    public static void main(String[] args) {
        String s1 = "sdfghjkl";
        String s2 = new String("asdsa");
        String s3 = new String(
                new byte[] {49, 50, 51}
        );

        String s4 = s1.substring(0, 2);

//        System.out.println("tt" + 4);


        String res = "";
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
//            res += i;
            builder.append(i);
        }
        res = builder.toString();
        char[] chars = res.toCharArray();

        System.out.println(res);

        switch (res) {
            case "asd" :  break;
            case "0123456789"  :
                System.out.println("hey");;
        }
    }
}
