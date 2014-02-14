package org.balent.codeval;

public class TestingClass {
    public static void main(String[] args) {
        String end = "Hello";
        for (int i = 0; i < end.length(); i++) {
            System.out.println(end.substring(0, i) + end.substring(i + 1, end.length()));
        }
    }
}
