package org.sample;

public class SampleAfter {
    public static void main(String[] args) {
        System.out.println();

        int a = 10;
        int b = 5;
        addAndPrint(a, b, "SUM1: ");
        minusAndPrint(a, b, "DIFFERENCE: ");

        System.out.println();

        int x = 15;
        int y = 7;
        addAndPrint(x, y, "SUM2: ");
        minusAndPrint(x, y, "DIFFERENCE: ");
    }

    private static int addAndPrint(int a, int b, String message) {
        int sum = a + b;
        System.out.println(message + sum);
        return sum;
    }

    private static int minusAndPrint(int a, int b, String message) {
        int diff = a- b;
        System.out.println(message + diff);
        return diff;
    }
}
