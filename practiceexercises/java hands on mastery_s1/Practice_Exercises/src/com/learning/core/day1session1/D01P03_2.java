package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P03_2 {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a week number (1-7): ");

        int weekNumber = scanner.nextInt();
 
        String weekday;
 
        if (weekNumber == 1) {

            weekday = "Monday";

        } else if (weekNumber == 2) {

            weekday = "Tuesday";

        } else if (weekNumber == 3) {

            weekday = "Wednesday";

        } else if (weekNumber == 4) {

            weekday = "Thursday";

        } else if (weekNumber == 5) {

            weekday = "Friday";

        } else if (weekNumber == 6) {

            weekday = "Saturday";

        } else if (weekNumber == 7) {

            weekday = "Sunday";

        } else {

            weekday = "Invalid Input";

        }
 
        System.out.println("Weekday: " + weekday);

    }

}