package Bai2;

import java.util.ArrayList;

public class DanhSachSV {
	private ArrayList<Student> ds;
	
	public DanhSachSV() {
		
	}
	
	public DanhSachSV(ArrayList<Student> ds) {
		this.ds = ds;
	}
	
	public void addSV(String id, String name, int age,String id1, String district, String province) {
		Address ad = new Address(id1, district, province);
		Student sv = new Student(id, name, age, ad);
		this.ds.add(sv);
	}
	
	public void printDS() {
		if(ds.isEmpty()) {
			System.out.println("Khong có");
			return;
		}
		for (Student student : ds) {
			student.output();
		}
	}
	
	public void SearchByID(String id) {
		for (Student student : ds) {
			if (student.getId() == id) {
				student.output();
				break;
			}
		}
	}
	
	public void fixProvince() {
		for (Student student : ds) {
			if (student.getAd().getProvince() == "Thanh Hóa") {
				student.fix();
			}
		}
	}
	
	public void deleteById(String id) {
		for (Student student : ds) {
			if (student.getId() == id)
				ds.remove(student);
		}
	}
}
