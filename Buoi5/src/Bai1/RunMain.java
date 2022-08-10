package Bai1;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong test: ");
		int n = sc.nextInt();
		
		PhongMay m[] = new PhongMay [n];
		for (int i=0; i<n; i++)
			m[i] = new PhongMay();
		for (int i=0; i<n; i++)
			m[i].input();
		System.out.printf("%-15s%-15s%-15s%-30s%-45s\n", "Ma may", "Ten May", "Dien Tich", "Quan Ly", "May");
		for (int i=0; i<n; i++)
			m[i].output();
		
	}
}
