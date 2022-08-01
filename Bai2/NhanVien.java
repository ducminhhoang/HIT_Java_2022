package Bai2;

import java.util.Scanner;

public class NhanVien {
	private static Scanner sc = new Scanner(System.in);
	private static int temp = 1;
	private int id;
	private String name, address, major;
	private int age;
		
	public NhanVien() {
		id = temp++;
	}
		
	public NhanVien(String name, String address, String major, int age) {
		id = temp++;
		this.name = name;
		this.address = address;
		this.major = major;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	public void input() {
		System.out.println("Thêm 1 nhân viên mới!");
		System.out.println("Nhập tên: "); name = sc.nextLine();
		do {
		System.out.println("Nhập tuổi: "); age = sc.nextInt();
		} while (age<=0);
		sc.nextLine();
		System.out.println("Nhập địa chỉ: "); address = sc.nextLine();
		System.out.println("Nhập bộ phận: "); major = sc.nextLine();
	}
		
	public void output() {
		System.out.printf("%-10d%-20s%-10d%-10s%-10s\n", id, name, age, address, major);
	}
		
	
	public static void main(String[] args) {
		NhanVien sv1 = new NhanVien();
		NhanVien sv2 = new NhanVien();
		NhanVien sv3 = new NhanVien();
		NhanVien sv4 = new NhanVien();
		NhanVien sv5 = new NhanVien();
		
		sv1.input();
		sv2.input();
		sv3.input();
		sv4.input();
		sv5.input();
		
		System.out.println("\tTHONG TIN CAC NHAN VIEN");
		System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
		sv1.output();
		sv2.output();
		sv3.output();
		sv4.output();
		sv5.output();
		
		
	}
}
