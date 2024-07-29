package org.sample;

public class SamplePracBefore {
    public static void main(String[] args) {
        // 8時間越えを残業とみなす
        double overWorkingHours1 = Employee1.calculateoverWorkingHours(6);
        System.out.println(overWorkingHours1);
    }
}