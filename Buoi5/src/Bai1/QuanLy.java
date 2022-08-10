package Bai1;

import java.util.Scanner;

public class QuanLy {
	Scanner sc = new Scanner(System.in);
	private String maQL, hoTen;
	
	public QuanLy() {
		
	}
	
	public void input() {
		System.out.println("Nhap maQL: "); maQL = sc.nextLine();
		System.out.println("Nhap ho ten: "); hoTen = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-30s", maQL + "-" + hoTen);
	}
	
	
}
