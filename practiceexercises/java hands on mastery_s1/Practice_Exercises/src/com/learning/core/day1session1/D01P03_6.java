package com.learning.core.day1session1;

import java.util.Scanner;
 
public class D01P03_6 {
 
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer: ");
    int number = scanner.nextInt();
    if (number < 0) {

      System.out.println("Factorial is not defined for negative numbers.");

      return;
    }
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
      System.out.println(factorial);
    }
    System.out.println("Factorial of " + number + " is " + factorial);

  }

}
