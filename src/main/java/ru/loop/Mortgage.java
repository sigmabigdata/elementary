package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount < 0) {
            double yearlyPayment = amount + (amount * percent / 100);
            amount = salary - yearlyPayment;
            salary = salary + salary - amount;
            year++;
        }
        return year;
    }
}
