package com.EmployeeSorting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Achyut", 70000));
        employees.add(new Employee(1, "Sannihith", 77000));
        employees.add(new Employee(2, "Krishna", 98000));
        
        Collections.sort(employees);
        System.out.println("Employees sorted by ID:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Collections.sort(employees, Employee.NameComparator);
        System.out.println("\nEmployees sorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Collections.sort(employees, Employee.SalaryComparator);
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Employee originalEmployee = employees.get(0);
        Employee clonedEmployee = originalEmployee.clone();
        System.out.println("\nCloned Employee: " + clonedEmployee);
        
        System.out.println("\nIterating over Employees:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
