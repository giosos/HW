package HW6;

public class two {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 10;
        printResult(number1, number2, isDivisible(number1, number2));
    }

    public static boolean isDivisible(int number1, int number2) {
        if (number1 % number2 == 0) {
            return true;
        }
        return false;
    }

    public static void printResult(int number1, int number2, boolean result) {
        if (number1 % number2 == 0) {
            System.out.println(number1 + " делится на " + number2 + " без остатка.");
        } else {
            System.out.println(number1 + " не делится на " + number2 + " без остатка.");
        }
    }
}
