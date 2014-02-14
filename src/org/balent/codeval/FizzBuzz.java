package org.balent.codeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        int lineCounter = 0;
        while ((line = in.readLine()) != null) {
            if (lineCounter > 0) {
                System.out.println();
            }
            lineCounter++;

            String[] numbers = line.split("\\s");
            if (numbers.length > 0) {

                int firstNumber = Integer.parseInt(numbers[0]);
                int secondNumber = Integer.parseInt(numbers[1]);
                int iterate = Integer.parseInt(numbers[2]);

                for (int baseNumber = 1; baseNumber <= iterate; baseNumber++) {
                    if ((baseNumber % firstNumber == 0) && (baseNumber % secondNumber == 0)) {
                        System.out.print("FB");
                    } else if (baseNumber % firstNumber == 0) {
                        System.out.print("F");
                    } else if (baseNumber % secondNumber == 0) {
                        System.out.print("B");
                    } else {
                        System.out.print(baseNumber);
                    }
                    if (baseNumber != iterate) {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}