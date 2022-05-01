public class getSumDivisibleByTreeNumbers {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int sum = 0;
        for (int i = number2; i > number1; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of numbers between number1 and number2 that divisible by 3 is " + sum);
    }
}
