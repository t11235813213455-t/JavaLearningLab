package com.company;

import java.io.*;

public class Main {

    public static final byte R = 13;
    public static final byte N = 10;

    public static void main(String[] args) throws IOException {
        int byte1 = System.in.read(), byte2;
        while (byte1 != -1) {
            byte2 = System.in.read();
            if (!(byte1 == R && byte2 == N)) {
                System.out.write(byte1);
            }
            byte1 = byte2;
        }
        System.out.flush();
    }
}
