package org.sample;

public class Sample2Prac {
    public static void main(String[] args) {
        double overWorkingHours1 = EmployeePrac2.calculateoverWorkingHours(6);
        System.out.println("残業時間: " + overWorkingHours1);
        EmployeePrac2 e = new EmployeePrac2();
        int WORKING_HOURS = 10;
        System.out.println("給料: " + e.getPayment(WORKING_HOURS));
    }
}
