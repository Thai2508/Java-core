package java_back_end.oop.p2.model;

import java.util.Scanner;

public class NhanSu {
	private String maso;
	private String hoten;
	private String sdt;
	protected int sogiolamviec;
	protected int luong1h;
	protected double luong =0;
	
	public NhanSu() {
		
	}
	
	public NhanSu(String maso, String hoten, String sdt, int sogiolamviec, int luong1h) {
		this.maso = maso;
		this.hoten = hoten;
		this.sdt = sdt;
		this.sogiolamviec = sogiolamviec;
		this.luong1h = luong1h;
	}
	
	public String getMaso() {
		return maso;
	}
	
	public void setMaso(String maso) {
		this.maso = maso;
	}
	
	public String getHoten() {
		return hoten;
	}
	
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSogiolamviec() {
		return sogiolamviec;
	}
	
	public void setSogiolamviec(int sogiolamviec) {
		this.sogiolamviec = sogiolamviec;
	}
	
	public int getLuong1h() {
		return luong1h;
	}
	
	public void setLuong1h(int luong1h) {
		this.luong1h = luong1h;
	}
	
	public double tinhLuong() {
		this.luong = this.luong1h * this.sogiolamviec;
		return this.luong;
	}
	
	public void nhapTT(Scanner sc) {
		do {
			System.out.print("Nhập Mã Số (1 -> 6 ký tự) : ");
			this.maso = sc.nextLine();
		} while (this.maso.length() < 1 || this.maso.length() > 7);
		
		do {
			System.out.print("Nhập Họ & Tên (Độ dài 9 -> 14) : ");
			this.hoten = sc.nextLine();
		} while (this.hoten.length() < 9 || this.hoten.length() > 14);
		
		do {
			System.out.print("Nhập SĐT (10 số) : ");
			this.sdt = sc.nextLine();
		} while (this.sdt.length() != 10);
		
		do {
			System.out.print("Nhập Tổng Số Giờ Làm Việc Trong Tháng (100 -> 10000) : ");
			this.sogiolamviec = Integer.parseInt(sc.nextLine());
		} while (this.sogiolamviec < 100 || this.sogiolamviec > 10000);
		
		do {
			System.out.print("Nhập Số Tiền Làm Việc Trong 1h (100 -> 1000) : ");
			this.luong1h = Integer.parseInt(sc.nextLine());
		} while (this.luong1h < 100 || this.luong1h > 1000);
		
	}
	
	public void xuatTT() {
		System.out.print("|"+this.maso+"\t|"+this.hoten+"\t\t|"+this.sdt+"\t|"+this.sogiolamviec+"\t|");
	}
	
	

	
}
