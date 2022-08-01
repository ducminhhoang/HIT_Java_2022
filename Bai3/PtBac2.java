package Bai3;

import java.util.Scanner;

public class PtBac2 {
	private static Scanner sc = new Scanner(System.in);
	private double a, b, c;
	
	public PtBac2(){
	}

	public PtBac2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void nhap() {
		System.out.println("Giai pt bac 2 co dang: ax^2 + bx + c = 0");
		System.out.println("Nhap a: "); a = sc.nextFloat();
		System.out.println("Nhap b: "); b = sc.nextFloat();
		System.out.println("Nhap c: "); c = sc.nextFloat();
	}
	
	public void caculate() {
		double denta = b*b-4*a*c;
		if (denta>0) {
			double x1 = (-b+Math.sqrt(denta))/(2*a), x2 = (-b-Math.sqrt(denta))/(2*a);
			System.out.println("Co 2 nghiem phan biet:\nx1 = " + x1 + "\nx2= " + x2);
		}
		else if (denta==0) {
			double x = -b/(2*a);
			System.out.println("Co 2 nghiem kep: x1=x2=");
		}
		else
			System.out.println("Vo nghiem");
	}
	
	public void xuat() {
		System.out.println("Phuong trinh bac 2: " + a +"x^2 + " + b + "x + " + c + " = 0");
		caculate();
	}
	
	public static void main(String[] args) {
		PtBac2 pt = new PtBac2();
		
		pt.nhap();
		pt.xuat();
	}
	
}
