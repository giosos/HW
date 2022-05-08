package HW6;

public class three {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 9;
        int num3 = 3;
        System.out.println(isDivisibleThirdNumber(num1, num2, num3));
    }

    public static boolean isDivisibleThirdNumber(int num1, int num2, int num3) {
        if (num1 % num3 == 0 && num2 % num3 == 0) {
            return true;
        }
        return false;
    }
}
