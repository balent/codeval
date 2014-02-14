package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SelfNumbers {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.length() > 0) {

                int number = Integer.parseInt(line);
                isSelfNumber(number);
            }
        }
    }

    private static void isSelfNumber(int number) {
        int[] digits = new int[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = 0;
        }

        int numberCopy = number;
        int numberLength = String.valueOf(numberCopy).length();

        while(numberCopy > 0) {
            digits[numberCopy % 10] += 1;
            numberCopy = numberCopy / 10;
        }

        while(number > 0) {
            if (number % 10 != digits[numberLength - 1]) {
                System.out.println(0);
                return;
            }

            numberLength = numberLength - 1;
            number = number / 10;
        }

        System.out.println(1);
    }
}


