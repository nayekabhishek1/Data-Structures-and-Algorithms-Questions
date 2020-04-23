package com.nayek.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, "Abhishek", "Java"));
		list.add(new Employee(1, "Rohan", "Java"));
		list.add(new Employee(4, "Avnish", "ETL"));
		list.add(new Employee(20, "Krishna", "Big data"));
		list.add(new Employee(15, "Mishra", "Middleware"));
		list.add(new Employee(12, "Sukhman", "Operations"));
		list.add(new Employee(2, "Ankit", "Law"));

		System.out.println("Employee list before sorting");
		list.forEach(System.out::println);

		Collections.sort(list);
		System.out.println("******************************************************");
		System.out.println("Employee list after sorting on name using comparable");
		list.forEach(System.out::println);

		System.out.println("******************************************************");
		System.out.println("Employee list after sorting on department using comparator");
		// We can write the comparator sorting logic as mentioned below(anonymous inner
		// class)
		// if the code is not reusable or we can write this logic in a separate class
		// for reusability.
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getDepartment().compareTo(o2.getDepartment());
			}
		});
		list.forEach(System.out::println);
	}

}
