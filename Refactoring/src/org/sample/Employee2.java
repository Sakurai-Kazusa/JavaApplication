package org.sample;

public class Employee2 {
    public static int STANDARD_WORK_HOURS_PER_DAY = 8;
    public static double calculateoverWorkingHours(double workingHours) {
        if (workingHours < STANDARD_WORK_HOURS_PER_DAY) {
            return 0;
        } else {
            return workingHours - STANDARD_WORK_HOURS_PER_DAY;
        }
    }
}
