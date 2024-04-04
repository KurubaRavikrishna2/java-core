package com.learning.core.day1session1;

import java.util.Scanner;
 
public class D01P03_4 {
 
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
 
    System.out.println("Enter the marks obtained by the student (out of 100): ");

    int percentage = scanner.nextInt();
 
    String grade;
 
    if (percentage >= 60) {

      grade = "A Grade";

    } else if (percentage >= 45) {

      grade = "B Grade";

    } else if (percentage >= 35) {

      grade = "C Grade";

    }else {

      grade = "Fail";

    }
 
    System.out.println( grade);

  }

}