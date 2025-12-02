package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
//        byte[] data = {0x33, 0x45, 0x01}; // {0011 0011, 0100 0101, 0000 0001}
//
//        C1 = rotateLeft(C0) xor b1 = 0000 0000 xor 0011 0011 = 0011 0011 = 51dec;
//        C2 = rotateLeft(C1) xor b2 = 0110 0110 xor 0100 0101 = 0010 0011 = 35dec;
//        C3 = rotateLeft(C2) xor b3 = 0100 0110 xor 0000 0001 = 0100 0111 = 71dec;
        try {
            System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int read;
        int sum = 0;
        while ((read = inputStream.read()) != -1) {
            System.out.println("Current sum = " + sum);
            sum = Integer.rotateLeft(sum, 1) ^ read;
        }
        return sum;
    }
}
