package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsPermutation {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.length() != 0) {
                String[] data = line.split(",");
                int length = Integer.parseInt(data[0]);
                String word = data[1];
                Set<Character> alphabet = new HashSet<Character>();
                for (int i = 0; i < word.length(); i++) {
                    alphabet.add(word.charAt(i));
                }

                String alphabetString = "";

                for (Character ch : alphabet) {
                    alphabetString += ch;
                }

                String result = recursiveFunction("", alphabetString, length);
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

    public static String recursiveFunction(String begin, String symbols, int length) {
        if (begin.length() == length) {
            return begin + ",";
        } else {
            String full = "";
            for (int i = 0; i < symbols.length(); i++) {
                full += recursiveFunction(begin + symbols.charAt(i), symbols, length);
            }
            return full;
        }
    }
}
