package com.learning.core.day2sessions;

import java.util.HashMap;
import java.util.Map;

public class D02P05_5 {

    public static void main(String[] args) {
        String[] arr = {"abc", "efg", "cde", "ghi", "ija"}; 

        if (canFormCircle(arr)) {
            System.out.println("Yes");
            System.out.println("Can be chained to form a circle:");
            for (String str : arr) {
                System.out.print(str + " ");
            }
        } else {
            System.out.println("No");
            System.out.println("Cannot be chained to form a circle.");
        }
    }

    public static boolean canFormCircle(String[] arr) {
        Map<Character, String> map = new HashMap<>();
        for (String str : arr) {
            char firstChar = str.charAt(0);
            if (map.containsKey(firstChar)) {
                return false;  }
            map.put(firstChar, str);
        }

           for (String str : arr) {
            char lastChar = str.charAt(str.length() - 1);
            if (!map.containsKey(lastChar)) {
                return false;
            }
        }

        return true; // All conditions met, circle can be formed
    }
}