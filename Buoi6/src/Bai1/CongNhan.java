package Bai1;

public class CongNhan extends CanBo{
	private String lev;
	
	public CongNhan() {
		
	}

	public CongNhan(String lev) {
		super();
		this.lev = lev;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap bac: "); lev = sc.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf("%-10s", lev);
	}
	
}
