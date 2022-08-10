package Bai1;

import java.util.Scanner;

public class PhongMay {
	Scanner sc = new Scanner(System.in);
	private String maPhong, tenPhong;
	private double dienTich;
	private QuanLy x = new QuanLy();
	private May y = new May();
	
	public PhongMay() {
		this.x = new QuanLy();
		this.y = new May();
	}

	public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May y) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.x = x;
		this.y = y;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public QuanLy getX() {
		return x;
	}

	public void setX(QuanLy x) {
		this.x = x;
	}

	public May getY() {
		return y;
	}

	public void setY(May y) {
		this.y = y;
	}
	
	public void input() {
		System.out.println("Nhap ma phong: "); maPhong = sc.nextLine();
		System.out.println("Nhap ten phong: "); tenPhong = sc.nextLine();
		System.out.println("Nhap dien tich: "); dienTich = sc.nextDouble();
		x.input();
		y.input();
	}
	
	public void output() {
		System.out.printf("%-15s%-15s%-15f", maPhong, tenPhong, dienTich);
		x.output();
		y.output();
		System.out.println();
	}
	
}
