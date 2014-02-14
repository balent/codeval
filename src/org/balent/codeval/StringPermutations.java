package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class StringPermutations {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.length() != 0) {
                String result = recursiveFunction("", line);
                String[] words = result.split(",");
                Arrays.sort(words);
                for (int i = 0; i < words.length; i++) {
                    System.out.print(words[i]);
                    if (i + 1 < words.length) {
                        System.out.print(",");
                    }
                }
            }
            System.out.println();
        }
    }

    public static String recursiveFunction(String begin, String end) {
        if (end.length() == 0) {
            return begin + ",";
        } else {
            String full = "";
            for (int i = 0; i < end.length(); i++) {
                full += recursiveFunction(begin + end.charAt(i), end.substring(0, i) + end.substring(i + 1, end.length()));
            }
            return full;
        }

    }
}