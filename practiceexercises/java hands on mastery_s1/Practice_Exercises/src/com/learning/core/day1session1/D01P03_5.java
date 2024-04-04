package com.learning.core.day1session1;

import java.util.Scanner;
public class D01P03_5 {
  public static void main(String[] args) {
    Scanner G = new Scanner(System.in);
    System.out.print("Input number of rows: ");
    int n = G.nextInt();
 
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {

        System.out.print(i+" ");
      }
      System.out.println(" ");

      }

  }

}