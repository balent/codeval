package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fib {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.length() > 0) {
                int counter = 0;
                long number = Integer.parseInt(line);

                System.out.println(fib(number));
            }
        }
    }

    private static long fib(long number) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < number; i++ ) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return first;
    }
}


