package Bai1;

import java.util.Scanner;

public class Chinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhChuNhat a = new HinhChuNhat();
		
		System.out.println("Cách 1: ");
		a.input();
		a.output();
		
		HinhChuNhat b = new HinhChuNhat();
		
		System.out.println("Cách 2: ");
		double width, height;
		do {
			System.out.println("Nhập chiều dài: "); width = sc.nextFloat();
			System.out.println("Nhập chiều cao: "); height = sc.nextFloat();
			} while(width <=0 || height <= 0);
		b.setWidth(width);
		b.setHeight(height);
		
		b.output();
		
		if (a.getArea() > b.getArea())
			System.out.println("Diện tích hình a lớn hơn và nó bằng " + a.getArea());
		else if (a.getArea() == b.getArea())
			System.out.println("Diện tich 2 hình bằng nhau và bằng " + a.getArea());
		else
			System.out.println("Diện tích hình b lớn hơn và bằng " + b.getArea());
	}
}
