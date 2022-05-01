public class Substring {
    public static void main(String[] args) {
        String str = "hello";
        int start = 1;
        int finish = 4;

        for (int i = start - 1; i < finish - 1; i++) {

            System.out.println(str.charAt(i));
        }
    }
}
