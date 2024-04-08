package com.learning.core.day3sessions;

import java.util.Hashtable;

public class D03P08_9 {
	public static void main(String[] args) {
        
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

     
        employeeHashtable.put(1, new Employee(1, "Alice", "HR", "Manager"));
        employeeHashtable.put(2, new Employee(2, "Bob", "IT", "Developer"));
        employeeHashtable.put(3, new Employee(3, "Charlie", "Finance", "Accountant"));
        employeeHashtable.put(4, new Employee(4, "David", "Marketing", "Sales Executive"));

      
        boolean isEmpty = employeeHashtable.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);
    }

}
