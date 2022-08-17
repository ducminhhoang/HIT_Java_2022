package Bai2;

import java.util.Scanner;

public class PhuongTien {
	Scanner sc = new Scanner(System.in);
	private String name, type;
	private double capacity, price, tax;
	
	public PhuongTien() {
		
	}

	public PhuongTien(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
		if (capacity < 100)
			tax = price*0.02;
		else if (capacity < 200)
			tax = price*0.06;
		else
			tax = price*0.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void input() {
		System.out.println("Nhập tên chủ xe: "); name = sc.nextLine();
		System.out.println("Nhập loại xe: "); type = sc.nextLine();
		System.out.println("Nhập dung tích: "); capacity = sc.nextDouble();
		System.out.println("Nhập giá trị xe: "); price = sc.nextDouble();
		if (capacity < 100)
			tax = price*0.02;
		else if (capacity < 200)
			tax = price*0.06;
		else
			tax = price*0.1;
		
	}
	
	public void output() {
		System.out.printf("%-20s%-20s%-20f%-20f%-20f", name, type, capacity, price, tax);
		System.out.println();
	}
}
