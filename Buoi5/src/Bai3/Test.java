package Bai3;

import java.util.Scanner;

public class Test {
	public static boolean isPrime(int n) {
		for (int i=2; i<Math.sqrt(n); i++)
			if (i % 2 == 0)
				return false;
		return true;
	}
	
	public static boolean isPrime(long n) {
		for (int i=2; i<Math.sqrt(n); i++)
			if (i % 2 == 0)
				return false;
		return true;
	}
	
	public static boolean isPrime(float n) {
		if ((int)n - n == 0) {
			for (int i=2; i<Math.sqrt(n); i++)
				if (i % 2 == 0)
					return false;
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(double n) {
		if ((int)n - n == 0) {
			for (int i=2; i<Math.sqrt(n); i++)
				if (i % 2 == 0)
					return false;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n(int): "); n = sc.nextInt();
		if (isPrime(n))
			System.out.println("n la so nguyen to"); 
		else
			System.out.println("n khong la so nguyen to");
		
		System.out.println("Nhap m(long): "); long m = sc.nextLong();
		if (isPrime(m))
			System.out.println("m la so nguyen to"); 
		else
			System.out.println("m khong la so nguyen to");
		
		System.out.println("Nhap p(float): "); float p = sc.nextFloat();
		if (isPrime(p))
			System.out.println("p la so nguyen to"); 
		else
			System.out.println("p khong la so nguyen to");
		
		System.out.println("Nhap q(Double): "); double q = sc.nextDouble();
		if (isPrime(q))
			System.out.println("q la so nguyen to"); 
		else
			System.out.println("q khong la so nguyen to");
	}
}
