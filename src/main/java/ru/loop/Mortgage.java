package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double balance = 0;
        double remains = amount;
        double yearlyPayment = amount + (amount * (percent / 100));
        while (amount >= 0) {
            amount = salary - yearlyPayment;
            balance =

            year++;

        }
        return year;
    }
}
