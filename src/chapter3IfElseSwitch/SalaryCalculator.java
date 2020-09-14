package chapter3IfElseSwitch;

/*
IF statement
All salespeople get a payment of $1000 a week.
Salespeople who exceeds 10 sales a week, get an extra bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String args[]) {
        //Initialize values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get the values we don't have
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }
        //Output
        System.out.println("The employee salary is $" + salary);
    }
}
