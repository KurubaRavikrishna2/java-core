package com.learning.core.day2sessions;

import java.util.Scanner;

public class D02P05_6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a string (or 'q' to quit): ");
      String str = scanner.nextLine();

      if (str.equals("q")) {
        break;
      }

      int length = longestPrefixSuffix(str);
      System.out.println("Length of longest prefix which is also a suffix: " + length);
    }

    scanner.close();
  }

  public static int longestPrefixSuffix(String str) {
	  int n = str.length();
	    int i = 0;
	    int j = n - 1;
	    int len = 0;

	    // Iterate while i and j are valid indices
	    while (i < n && j >= 0) {
	      // If characters match, increment i and update length
	      if (str.charAt(i) == str.charAt(j)) {
	        len++;
	        i++;
	        j--;
	      } else {
	        // If characters don't match, reset i and j for next comparison
	        i = 0;
	        j--;
	      }
	    }

	    return len;
}
}