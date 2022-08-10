package Bai2;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenh;
		DanhSachSV dssv = new DanhSachSV();

		System.out.println("1. Nhập một mảng n sinh viên\r\n" + "2. Hiển thị thông tin các sinh viên ra màn hình.\r\n"
				+ "3. Tìm kiếm sinh viên theo Id và hiển thị ra màn hình.\r\n"
				+ "4. Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”\r\n"
				+ "5. Xóa sinh viên theo Id\r\n" + "0. Thoát");

		do {
			lenh = sc.nextInt();
			switch (lenh) {
			case 1:
				System.out.println("Nhập mảng sinh viên........");
				System.out.println("Nhập số lượng mảng: ");
				int n = sc.nextInt();
				while (n <= 0) {
					System.out.println("Nhap lai: ");
					n = sc.nextInt();
				}
				for (int i = 0; i < n; i++) {
					String id, name, id1, district, province;
					int age;
					sc.nextLine();
					System.out.println("Nhap ma sv: ");
					id = sc.nextLine();
					System.out.println("Nhap ten: ");
					name = sc.nextLine();
					System.out.println("Nhap tuoi: ");
					age = sc.nextInt();
					while (age <= 0) {
						System.out.println("Nhap lai");
						age = sc.nextInt();
					}
					System.out.println("Nhap id: "); id1 = sc.nextLine();
					 
					 System.out.println("Nhap huyen: "); district = sc.nextLine();
					 System.out.println("Nhap tinh: "); province = sc.nextLine();
					dssv.addSV(id, name, age, id1,district, province);
				}
				break;
			case 2:
				System.out.println("Thông tin các sinh viên");
				dssv.printDS();
				break;
			case 3:
				System.out.println("Tìm kiếm sinh viên theo Id");
				System.out.println("Nhap id cần tim: ");
				String id = sc.nextLine();
				dssv.SearchByID(id);
				break;
			case 4:
				System.out.println("Sửa các sinh viên có province");
				dssv.fixProvince();
			case 5:
				System.out.println("Xóa sinh viên theo Id");
				System.out.println("Nhập id cần xóa: ");
				String id1 = sc.nextLine();
				dssv.deleteById(id1);
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập lại: ");
			}
		} while (lenh != 0);
	}
}
