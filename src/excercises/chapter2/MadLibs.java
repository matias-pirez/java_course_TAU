package excercises.chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main (String arg []){

        // Ask a season of the year
        System.out.println("Tell me a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Ask a whole number
        System.out.println("Tell me a whole number");
        int wholeNumber = scanner.nextInt();

        // Ask an adjective
        System.out.println("Tell me an adjective");
        String adjective = scanner.next();
        scanner.close();

        // Print to the console> "On a <adjective> <season of the year> day, I drink a minimum of <whole number> cups of coffee."
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + wholeNumber +
                " cups of coffee.");
    }
}
