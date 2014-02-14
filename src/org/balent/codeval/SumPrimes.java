package org.balent.codeval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPrimes {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        int testedNumber = 0;

        while (counter < 1000) {
            if (isInteger(testedNumber)) {
                sum += testedNumber;
                counter++;
            }
            testedNumber++;
        }
        System.out.println(sum);
    }

    private static boolean isInteger(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
