package Bai1;

import java.util.Scanner;

public class RunMain { 
	public static Scanner sc = new Scanner(System.in);
	public static int temp = 0;
	public static void main(String[] args) {
		
		CanBo []cb = new CanBo[100];
		System.out.println("1: Add 1 cán bộ vào List tương ứng\r\n"
				+ "2: Hiển thị danh sách các cán bộ\r\n"
				+ "3: Xóa 1 cán bộ theo id\r\n"
				+ "4: Tìm kiếm 1 cán bộ theo id\r\n"
				+ "5: Dừng chương trình\r\n"
				+ "");
		int select;
		do {
			System.out.println("Nhập lựa chọn: ");
			select = sc.nextInt();
			switch (select) {
			case 1:
				input(cb);
                break;
			case 2:
				output(cb);
				break;
			case 3:
				delete(cb);
				break;
			case 4:
				search(cb);
				break;
			case 5:
				break;
			default:
				System.out.println("Nhập chưa đúng nhập lại...");
			}
		} while (select!=5);
	}
	
	//1. Add 1 cán bộ vào List tương ứng
	public static void input(CanBo[] cb) {
		int select;
		do {
		System.out.println("Nhập 1. Kỹ Sư\n2. Công nhân\n3. Nhân viên\n");
		select = sc.nextInt();
		} while (select<1 || select>3);
		if (select == 1) {
			cb[temp] = new KySu();
		} else if (select == 2)
			cb[temp] = new CongNhan();
		else
			cb[temp] = new NhanVien();
        System.out.println("Nhap thong tin can bo... ");
        cb[temp].input();
        temp++;
	}
	
	//2. Hiển thị danh sách các cán bộ
	public static void output(CanBo[] cb) {
		System.out.println("Hiển thi danh sách cán bộ.....");
		
		System.out.printf("%-10s%-20s%-10s%-10s%-20s\n", "id", "Ho va ten", "nam sinh", "gioi tinh", "dia chi");
		for (int i=0; i<temp; i++) {
			cb[i].output();
			System.out.println();
		}
	}
	
	//3. Xóa 1 cán bộ theo id
	public static void delete(CanBo[] cb) {
		System.out.println("Xóa 1 cán bộ....");
		int id;
		boolean check = false;
		System.out.println("Nhap id can bo can xoa: "); id = sc.nextInt();
		for (int i=0; i<temp; i++)
			if (cb[i].getId() == id) {
				for (int j=i; j<temp-1; j++)
					cb[j] = cb[j+1];
				temp--;
				check = true;
				break;
			}
		if (check) {
			System.out.println("Da xoa can bo " + id);	
			System.out.println("List can bo sau khi xoa: ");
			System.out.printf("%-10s%-20s%-10s%-10s%-20s%-20s", "id", "Ho va ten", "nam sinh", "gioi tinh", "dia chi", "Khac");
			for (int i=0; i<temp; i++)
				cb[i].output();
		}
		else
			System.out.println("Không có id " + id + " đó");
	}
	
	//4. Tìm kiếm 1 cán bộ theo id
	public static void search(CanBo[] cb) {
		System.out.println("Tìm kiếm cán bộ....");
		System.out.println("Nhập id cán bộ cần tìm: "); int id = sc.nextInt();
		boolean check = false;
		for (int i=0; i<temp; i++)
			if (cb[i].getId() == id) {
				System.out.println("Đã tìm thấy: ");
				System.out.printf("%-10s%-20s%-10s%-10s%-20s\n", "id", "Ho va ten", "nam sinh", "gioi tinh", "dia chi");
				cb[i].output();
				check = true;
				break;
			}
		if (!check)
			System.out.println("Không tìm thấy id " + id + " đó");
	}
}
