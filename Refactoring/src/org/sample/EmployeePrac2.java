package org.sample;

public class EmployeePrac2 {
    int PAYMENT_PER_HOUR = 1000;
    double OVERTIME_PAY_RATE = 1.5;

    public double getPayment(int workingHours) {
        double overWorkingHours = calculateoverWorkingHours(workingHours);
        double paymentForoverWorkingHours = this.PAYMENT_PER_HOUR * this.OVERTIME_PAY_RATE * overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkingHours = this.PAYMENT_PER_HOUR * standardWorkingHours;
        return paymentForoverWorkingHours + paymentForStandardWorkingHours;
    }

    public static double calculateoverWorkingHours(double workingHours) {
        int STANDARD_WORK_HOURS_PER_DAY = 8;
        if (workingHours < STANDARD_WORK_HOURS_PER_DAY) {
            return 0;
        } else {
            return workingHours - STANDARD_WORK_HOURS_PER_DAY;
        }
    }
}
