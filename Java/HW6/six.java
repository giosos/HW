package HW6;

public class six {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int div = 4;

        notDivisibleFour(num1, num2, div);
    }

    public static int notDivisibleFour(int num1, int num2, int div) {
        for (int i = num1; i < num2; i++) {
            if (i % div != 0) {
                System.out.println(i);
            }
        }
            return 0;

    }
}
