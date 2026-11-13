package com.lpa.tourism.scenes.config;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Transaction;

import com.lpa.tourism.scenes.dao.EmployeeDAO;
import com.lpa.tourism.scenes.entities.Employee;

public class EmployeeService {
	public static EmployeeDAO dao = new EmployeeDAO();
	public static final Scanner scan = new Scanner(System.in);
	public void getAllEmployees(){
		for(Employee emp : dao.getAll()) {
			System.out.println(emp);
		}
	}
	
	public void saveEmployee() {
		scan.nextLine();
		System.out.println("Enter the full Name");
		String name = scan.nextLine();
		System.out.println("Enter the Email Id");
		String email  = scan.nextLine();
		System.out.println("Enter the Phone Number");
		String phone  = scan.nextLine();
		System.out.println("Enter the Gender");
		String gender  = scan.nextLine();
		System.out.println("Enter the Qualification");
		String qual  = scan.nextLine();
		System.out.println("Enter the Date of Birth");
		String dob  = scan.nextLine();
		
		Employee emp = new Employee(name,email,gender,dob,qual,phone);
		
		dao.save(emp);
	}
	
	public void getById() {
		scan.nextLine();
		System.out.println("Enter the ID you are looking for ");
		int id = scan.nextInt();
		Employee emp = dao.getById(id);
		System.out.println(emp);
	}
	
	public void menu() {
		while(true) {
			System.out.println("==============================MENU===============================");
			System.out.println("Press 1 to display all Employees");
			System.out.println("Press 2 to register a new Employee");
			System.out.println("Press 3 to get employee by id");
			System.out.println("Press 9 to exit");
			System.out.println("Please enter your choice ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1 : getAllEmployees();break;
			case 2 : saveEmployee();break;
			case 3 : getById();break;
			case 9 : System.exit(ch);
			default : System.out.println("Sorry!!! you've entered a wrong choice.");
			}
		}
	}
}
