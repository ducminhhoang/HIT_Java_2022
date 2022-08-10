package Bai2;

import java.util.Scanner;

public class Address {
	Scanner sc = new Scanner(System.in);
	private String id, district, province;
	 
	public Address() {
		 
	}

	public Address(String id, String district, String province) {
		this.id = id;
		this.district = district;
		this.province = province;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	 
	public void input() {
		 System.out.println("Nhap id: "); id = sc.nextLine();
		 
		 System.out.println("Nhap huyen: "); district = sc.nextLine();
		 System.out.println("Nhap tinh: "); province = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-45s", id + "-" + district + "-" + province);
	}
}
