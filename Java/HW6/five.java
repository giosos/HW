package HW6;

public class five {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "welcome";
        String str3 = "hello";
        System.out.println(longestString(str1, str2, str3));
    }

    public static String longestString(String str1, String str2, String str3) {

        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            return str1;
        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            return str2;
        }
        return str3;
    }
}
