package chapter3IfElseSwitch;
/*
 IF ELSE
 All salespeople are expected to make at least 10 sales each week.
 For those who do, they receive a congratulatory message.
 For those who don't, they are informed of how many sales they were short.
 */


import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        // initialize the variables
        int sales;
        int expectedSales = 10;
        int salesShort;

        // Get the info we don't have
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the employee do?");
        sales = scanner.nextInt();
        scanner.close();

        // IF ELSE
        if (sales >= expectedSales){
            System.out.println("Congratulations, you've met the sales quota!");
        } else {
            salesShort = expectedSales - sales;
            System.out.println("This month you were " + salesShort + " sales short. Keep doing your best!");
        }
    }

}
