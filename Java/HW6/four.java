package HW6;

public class four {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 19;
        int num3 = 0;

        System.out.println(max3(num1, num2, num3));
    }

    public static int max3(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }

}
