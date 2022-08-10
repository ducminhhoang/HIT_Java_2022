package Bai1;

import java.util.Scanner;

public class May {
	Scanner sc = new Scanner(System.in);
	private String maMay, kieuMay, tinhTrang;
	
	public May() {
		
	}
	
	public void input() {
		System.out.println("Nhap ma may: "); maMay = sc.nextLine();
		System.out.println("Nhap kieu mayy: "); kieuMay = sc.nextLine();
		System.out.println("Nhap tinh trang: "); tinhTrang = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-45s", maMay + "-" + kieuMay + "-" + tinhTrang);
	}
	
	
}
