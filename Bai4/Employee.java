package Bai4;

import java.util.Scanner;

public class Employee {
	private static Scanner sc = new Scanner(System.in);
	private String id, name;
	private int age, workingDays;
	private double salary;
	private static final int PRICE = 50;
	
	public Employee() {
	}
	
	public Employee(String id, String name, int age, int workingDays) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDays = workingDays;
		this.salary = workingDays*PRICE;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public double getSalary() {
		salary = workingDays*PRICE;
		return salary;
	}
	
	public void intput() {
		System.out.println("Nhập mã nhân viên: "); id = sc.nextLine();
		System.out.println("Nhập họ tên:"); name = sc.nextLine();
		do {
			System.out.println("Nhập tuổi: "); age = sc.nextInt();	
		} while (age <=0 );
		do {
		System.out.println("Nhập số ngày công: "); workingDays = sc.nextInt();
		} while (workingDays<0);
		sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", "Manv", "Ho Ten", "Tuoi", "So ngay cong", "Luong");
		System.out.printf("%-10s%-20s%-10d%-10s%-10f\n", id, name, age, workingDays, salary);
	}
	
}

