package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        boolean resultZer = number == 0;
        boolean resultNeg = number < 0;
        if (resultZer) {
            System.out.println("Could not div by 0.");
        }
        if (resultNeg) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-1);
    }
}
