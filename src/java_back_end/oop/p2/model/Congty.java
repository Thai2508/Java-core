package java_back_end.oop.p2.model;

import java.util.Scanner;

public class Congty{
	private String tencongty;
	private String masothue;
	private double doanhthuthang;
	
	public Congty() {
		
	}
	
	public Congty(String tencongty, String masothue, double doanhthuthang) {
		this.tencongty = tencongty;
		this.masothue = masothue;
		this.doanhthuthang = doanhthuthang;
	}
	
	public String getTencongty() {
		return tencongty;
	}
	
	public void setTencongty(String tencongty) {
		this.tencongty = tencongty;
	}
	
	public String getMasothue() {
		return masothue;
	}
	
	public void setMasothue(String masothue) {
		this.masothue = masothue;
	}
	
	public double getDoanhthuthang() {
		return doanhthuthang;
	}
	
	public void setDoanhthuthang(double doanhthuthang) {
		this.doanhthuthang = doanhthuthang;
	}
	
	public void nhapCTy() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập Tên CTy : ");
		this.tencongty = sc.nextLine();
		
		System.out.print("Nhập Mã Số Thuế : ");
		this.masothue = sc.nextLine();
		
		System.out.print("Nhập Doanh Thu Tháng : ");
		this.doanhthuthang = Double.parseDouble(sc.nextLine());
	}
	
	public void xuatCTy() {
		System.out.println(new StringBuilder()
				.append("Công ty ").append(this.tencongty)
				.append("\nMã số thuế ").append(this.masothue)
				.append("\nDoanh thu tháng ").append(this.doanhthuthang));
	}
	
}
