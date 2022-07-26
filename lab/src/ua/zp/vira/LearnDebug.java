package ua.zp.vira;

import java.util.Scanner;

//this is a simple class that shows the branching of a program,
// decision-making


public class LearnDebug {
    public static void main(String[] args) {

        /*Write a simple program with a loop and conditional statements
         */
        System.out.println("Ex.1");
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();
        if (var > 0) {
            for (int i = 0; i < var; i++) {
                System.out.println(i);
            }
        } else System.out.println("You entered a negative number");

        /*Write a program that displays the numbers from 0 to 10 on the screen (from a new line).
        and write an even or odd number next to each one
        */
        System.out.println("\nEx.2");
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j + " -> even number");
            } else {
                System.out.println(j + " -> odd number");
            }
        }

        /*Write a program that displays information about the day of the week.
        For example, from Monday to Friday, the message “It's a work
        day" and for Saturday and Sunday it shows "It's a day off!"
         */
        System.out.println("\nEx.3");
        System.out.println("Enter the day of the week");
        Scanner scan1 = new Scanner(System.in);
        String dayWeek =
                scan1.nextLine();
        switch (dayWeek.toLowerCase()) {
            case "sunday", "saturday":
                System.out.println(dayWeek + " - it's a holiday");
                break;
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                System.out.println(dayWeek + " - it's a work day");
                break;
            default:
                System.out.println("You entered the wrong day of the week. Try again!");
        }

        /*Write a program that calculates the factorial of a number and outputs
        intermediate values on the screen. Condition: if intermediate value > 1000, end loop first
        write in the console "The maximum possible result has been achieved"
    */
        System.out.println("\nEx.4");
        System.out.println("Enter a number");
        Scanner scan2 = new Scanner(System.in);
        int var2 = scan.nextInt();
        int fact = 1;
        while (var2 > 0) {
            if (fact < 1000) {
                System.out.println(fact);
                fact *= var2;
            }
            var2--;
        }
        System.out.println("The maximum possible result has been achieved");

        /*Write a program that displays every 3rd i-th value of a loop
         */
        System.out.println("\nEx.5");
        System.out.println("Enter a number");
        Scanner scan3 = new Scanner(System.in);
        int var3 = scan.nextInt();
        for (int i = var3; i >= 0; i -= 3) {
            System.out.println(i);
        }
        /* OR
        */
        System.out.println("\n");
        for (int i=var3; i>=0; i--) {
           if ((i%3)==0) {
            System.out.println(i);
        }}
    }
}


