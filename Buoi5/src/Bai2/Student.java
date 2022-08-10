package Bai2;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private String   id, name;
	private int age;
	private Address ad = new Address();
	
	public Student() {
		
	}

	public Student(String id, String name, int age, Address ad) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.ad = ad;
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

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	public void input() {
		System.out.println("Nhap ma sv: "); id = sc.nextLine();
		System.out.println("Nhap ten: "); name = sc.nextLine();
		System.out.println("Nhap tuoi: "); age = sc.nextInt();
		while(age<=0) {
			System.out.println("Nhap lai");
			age = sc.nextInt();
		}
		System.out.println("Nhap dia chi: ");
		ad.input();
	}
	
	public void output() {
		System.out.printf("%-10s%-15s%-10s", id, name, age);
		ad.output();
	}
	
	public void fix() {
		ad.setProvince("Hải Phòng");
	}

}
