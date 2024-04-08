package com.learning.core.day2sessions;

import java.util.Scanner;

public class D02P05_9 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
 
		//String input = "Mr John Smith";
        String output = replaceSpaces(inputString);
        System.out.println(output);
    }
    
    public static String replaceSpaces(String input) {
        return input.replaceAll(" ", "%20");
    }
}