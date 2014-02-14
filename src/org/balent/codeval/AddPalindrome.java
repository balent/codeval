package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AddPalindrome {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.length() > 0) {
                int counter = 0;
                long number = Integer.parseInt(line);

                while (!isPalindrome(number)) {
                    counter++;
                    number = number + reverse(number);
                }
                System.out.println(counter + " " + number);
            }
        }
    }

    private static boolean isPalindrome(long number) {

        if (number % 10 == Integer.parseInt(String.valueOf(number).substring(0, 1))) {
            String numberStr = String.valueOf(number);
            if (numberStr.length() < 3) {
                return true;
            } else {
                return isPalindrome(Integer.parseInt(numberStr.substring(1, numberStr.length() - 1)));
            }
        } else {
            return false;
        }
    }

    private static long reverse(long number) {
        long reversed = 0;
        do {
            reversed = reversed * 10;
            reversed += number % 10;
            number = number / 10;
        } while (number != 0);

        return reversed;
    }
}


