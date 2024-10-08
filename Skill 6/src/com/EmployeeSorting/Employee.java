package com.EmployeeSorting;
import java.util.*;

public class Employee implements Comparable<Employee>, Cloneable {
	private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() { 
    	return id; 
    }
    
    public String getName() {
    	return name;
    }
    
    public double getSalary() {
    	return salary; 
    }
    
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }


	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, other.id);
	}
	
	public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Shouldn't happen since we implement Cloneable
        }
    }
	
	public static Comparator<Employee> NameComparator = new Comparator<>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Employee> SalaryComparator = new Comparator<>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };
}


