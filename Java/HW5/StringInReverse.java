public class StringInReverse {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);


        StringBuilder reversedString = new StringBuilder();
        reversedString.append(str);
        reversedString.reverse();

        System.out.println(reversedString);


    }

}

