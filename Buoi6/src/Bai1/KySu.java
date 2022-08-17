package Bai1;

public class KySu extends CanBo{
	private String major;
	
	public KySu() {
		
	}

	public KySu(String major) {
		super();
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap chuyen nganh: "); major = sc.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf("%-10s", major);
	}
}
