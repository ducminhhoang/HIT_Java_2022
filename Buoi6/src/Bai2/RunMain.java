package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1. Nhập thông tin và tạo danh sách các xe \r\n"
				+ "2. Xuất bảng kê khai tiền thuế trước bạ của các xe. \r\n"
				+ "3. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần\r\n"
				+ "4. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\r\n"
				+ "5. Thoát.\r\n"
				+ "");
		ArrayList<PhuongTien> lists = new ArrayList<PhuongTien>();
		int select;
		do {
			System.out.println("Nhập lựa chọn của bạn: ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				input(lists);
				break;
			case 2:
				output(lists);
				break;
			case 3:
				outputGiam(lists);
				break;
			case 4:
				outputTang(lists);
				break;
			case 5:
				break;
			default:
			}
		} while (select!=5);
	}
	
//	a. Nhập thông tin và tạo danh sách các xe 
	public static void input(ArrayList<PhuongTien> lists) {
		System.out.println("Nhập thông tin và tạo danh sách xe...");
		System.out.println("Nhập số lượng xe cần thêm: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			PhuongTien pt = new PhuongTien();
			pt.input();
			lists.add(pt);
		}
	}
	
//	b. Xuất bảng kê khai tiền thuế trước bạ của các xe. 
	public static void output(ArrayList<PhuongTien> lists) {
		if (lists.size()<1) {
			System.out.println("Không có dữ liệu");
			return;
		}
		System.out.println("Bảng kê khai...");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		for (PhuongTien phuongTien : lists) {
			phuongTien.output();
		}
	}
	
//	c. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần
	public static void outputGiam(ArrayList<PhuongTien> lists) {
		if (lists.size()<2) {
			output(lists);
			return;
		}
		PhuongTien []pt = new PhuongTien[lists.size()];
		for (int i=0; i<lists.size(); i++)
			pt[i] = new PhuongTien();
		for (int i=0; i<lists.size(); i++) {
			pt[i] = lists.get(i);
			for (int j=i+1; j<lists.size(); j++)
				if (pt[i].getTax() > lists.get(j).getTax())
					pt[i] = lists.get(i);
		}
		
		System.out.println("Bảng kê khai xếp theo giảm thuế...");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		for (int i=0; i<lists.size(); i++) {
			pt[i].output();
		}
	}
	
//	d. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần
	public static void outputTang(ArrayList<PhuongTien> lists) {
		if (lists.size()<2) {
			output(lists);
			return;
		}
		PhuongTien []pt = new PhuongTien[lists.size()];
		for (int i=0; i<lists.size(); i++)
			pt[i] = new PhuongTien();
		for (int i=0; i<lists.size(); i++) {
			pt[i] = lists.get(i);
			for (int j=i+1; j<lists.size(); j++)
				if (pt[i].getTax() < lists.get(j).getTax())
					pt[i] = lists.get(i);
		}
		
		System.out.println("Bảng kê khai xếp theo giảm thuế...");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		for (int i=0; i<lists.size(); i++) {
			pt[i].output();
		}
	}

}
