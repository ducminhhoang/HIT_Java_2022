package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
	Scanner sc = new Scanner(System.in);
	private double width;
	private double height;
	
	public HinhChuNhat() {
		
	}
	
	public HinhChuNhat(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void input() {
		do {
		System.out.println("Nhập chiều dài: "); width = sc.nextFloat();
		System.out.println("Nhập chiều cao: "); height = sc.nextFloat();
		} while(width <=0 || height <= 0);
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	public void output() {
		System.out.println("Chiều dài: " + width);
		System.out.println("Chiều cao: " + height);
		System.out.println("Diện tích: " + getArea());
		System.out.println("Chu vi: " + getPerimeter());
	}
}
