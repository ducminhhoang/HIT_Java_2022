package Bai1;

public class NhanVien extends CanBo{

	private String job;
	
	public NhanVien() {
		
	}

	public NhanVien(String job) {
		super();
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap cong viec: "); job = sc.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf("%-10s", job);
	}
}
