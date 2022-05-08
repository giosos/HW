


public class EvenNumber {
    public static void main(String[] args) {
        int number = 10;
        printCheckResultsMessage(number, isEven(number));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void printCheckResultsMessage(int number, boolean result) {
        if (number % 2 == 0) {
            System.out.println(number + " это четное число");
        } else {
            System.out.println(number + " это не четное число");
        }
    }
}






