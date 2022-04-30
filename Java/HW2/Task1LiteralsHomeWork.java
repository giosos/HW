public class Task1LiteralsHomeWork {

    public static void main(String[] args) {
        // declare a variable with year of favourite movie via decimal, octal, hexa-decimal and binary representation
        int yearOfFavouriteMovie = 2005;
        var yearOfFavouriteMovieBinary = 0b11111010101; // 0b means Beginning of Binary number.
        int yearOfFavouriteMovieOctal = 03725; // 0 means Beginning of Octal number. 2005/8 = 250 |5|, 250/8 = 31 |2|, 31/8 = 3 |7|, 3/8 = 0 |3|
        int yearOfFavouriteMovieHexa = 0x7d5; // 0x means Beginning ox Hexa Number. 2005/16 = 125 |5|, 125/8 = 7 |13|, 7/16 0 |7|

        int Revolver = 2005;
        // print them all via System.out.println - each number in each line - they have to be the same
        System.out.println("My favourite movie is Revolver, year of " + yearOfFavouriteMovieBinary);
        System.out.println("My favourite movie is Revolver, year of " + yearOfFavouriteMovie);
        System.out.println("My favourite movie is Revolver, year of " + yearOfFavouriteMovieHexa);
        System.out.println("My favourite movie is Revolver, year of " + yearOfFavouriteMovieOctal);

        // Print maximum positive and minimum negative values that can be stored
        // in an int variable via binary representation and print them out. Compare it with values in
        // https://www.w3schools.com/java/java_data_types.asp
        int maxValue = 0b10000000000000000000000000000000;
        int minValue = 0b1111111111111111111111111111111;
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}

// Giorgi Sosiashvili