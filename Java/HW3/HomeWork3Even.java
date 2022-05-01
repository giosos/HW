public class HomeWork3Even {

    public static void main(String[] args) {


        System.out.println(isEven(13)); // must print false
       
    }

    /**
     * @param number - input to be checked
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        // TODO implement the method

        if (number % 2 > 0) {

            return false;
        } else {
            return true;
        }
    }
}

//finished