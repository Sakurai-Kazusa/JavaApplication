package org.sample;

public class Employee1 {
    public static double calculateoverWorkingHours(double workingHours) {
        if (workingHours < 8) {
            return 0;
        } else {
            return workingHours - 8;
        }
    }
}
