public class HomeWork3PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(12)); // must print true

    }

    /**
     * https://en.wikipedia.org/wiki/Prime_number
     *
     * @param number - integer number > 0
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrimeNumber(int number) {
        // TODO implement the method
        for (int i = 2; i < number; i++) {
            System.out.println(i);
            if (number % i == 0)
                return false;
        }
        return true;

    }
}

//finished