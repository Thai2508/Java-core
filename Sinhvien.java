import java.util.Scanner;

public class Sinhvien{
	private int mssv;
	private String name;
	private int age;
	private float dth;
	private float dlt;
	private float dtb=0;
	private String xl;
	
	public int getMssv() {
		return mssv;
	}
	
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getDth() {
		return dth;
	}

	public void setDth(float dth) {
		this.dth = dth;
	}
	
	public float getDlt() {
		return dlt;
	}
	
	public void setDlt(float dlt) {
		this.dlt = dlt;
	}
	
	public float getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	
	public void DTB() {
		this.dtb = (this.dth+this.dlt)/2;
	}
	
	public String getXL() {
		return xl;
	}
	
	public void setXL(String xl) {
		this.xl = xl;
	}
	
	public void XepLoai() {
		if (this.dtb >= 8) {
			this.xl = "Giỏi";
		} else if(this.dtb >= 6.5 && this.dtb < 8) {
			this.xl = "Khá";
		} else if (this.dtb >= 5 && this.dtb < 6.5) {
			this.xl = "TB";
		} else {this.xl = "Yếu";}
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MSSV : ");
		this.mssv = Integer.parseInt(sc.nextLine());
		
		System.out.print("Name : ");
		this.name = sc.nextLine();
		
		System.out.print("Age : ");
		this.age = Integer.parseInt(sc.nextLine());
		
		this.dth = diem("ĐTH");
		
		this.dlt = diem("ĐLT");
		
	}
	
	public float diem(String monhoc) {
		Scanner sc = new Scanner(System.in);
		int t;
		do {
			System.out.print(monhoc + " : ");
			t = Integer.parseInt(sc.nextLine());
		} while (t >10 || t<0);
		return t;
	}
	
	public void Xuat(int stt) {
		System.out.print("|"+stt+"\t|");
		System.out.print(this.mssv+"\t\t|");
		System.out.print(this.name+"\t\t\t|");
		System.out.print(this.age+"\t|");
		System.out.print(this.dth+"\t|");
		System.out.print(this.dlt+"\t|");
		System.out.print(this.dtb+"\t|");
		System.out.println(this.xl+"\t|");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
	}

	
}