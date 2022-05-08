package HW6;

public class seven {
    public static void main(String[] args) {
        int start = 10;
        int finish = 16;
        int sum = 0;

        sum(start, finish, sum);
        System.out.println(sum(start, finish, sum));

    }

    public static int sum(int start, int finish, int sum) {
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
