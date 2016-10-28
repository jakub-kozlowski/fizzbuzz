package equalexperts;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        final Scanner scanner = new Scanner(System.in);
        final App fizzBuzzApp = new App();
        while( scanner.hasNextInt() )
            System.out.print(fizzBuzzApp.getFizzBuzz(scanner.nextInt()) + " ");
        System.out.println();
    }

    public String getFizzBuzz(int n) {
        return n % 15 == 0 ? "fizzbuzz"
                : n % 5 == 0 ? "buzz"
                : n % 3 == 0 ? "fizz"
                : Integer.toString(n);
    }
}
