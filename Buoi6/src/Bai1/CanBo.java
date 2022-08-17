package Bai1;

import java.util.Scanner;

public class CanBo {
	Scanner sc = new Scanner(System.in);
	private String hvt, sex, address;
	private int born, id;
	private static int temp = 1;
	
	public CanBo() {
		id = temp++;
	}
	
	public CanBo(String hvt, String sex, String address, int born) {
		id = temp++;
		this.hvt = hvt;
		this.sex = sex;
		this.address = address;
		this.born = born;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHvt() {
		return hvt;
	}

	public void setHvt(String hvt) {
		this.hvt = hvt;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}
	
	public void input() {
		System.out.println("Nhap ho va ten: "); hvt = sc.nextLine();
		do {
			System.out.println("Nhap nam sinh: "); born = sc.nextInt();
		} while(born>2022);
		sc.nextLine();
		System.out.println("Nhap gioi tinh: "); sex = sc.nextLine();
		System.out.println("Nhap dia chi: "); address = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-10s%-20s%-10s%-10s%-20s", id, hvt, born, sex, address);
	}
	
	
}
