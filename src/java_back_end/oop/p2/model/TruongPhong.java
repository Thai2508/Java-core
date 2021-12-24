package java_back_end.oop.p2.model;

import java.util.Scanner;

public class TruongPhong extends NhanSu{
	private int sonhanvien=0;
	private double tongluong=0;

	public int getSonhanvien() {
		return sonhanvien;
	}

	public void setSonhanvien(int sonhanvien) {
		this.sonhanvien = sonhanvien;
	}
	
	@Override
	public double tinhLuong() {
		return super.tinhLuong()+(this.sonhanvien * 100);
	}

	@Override
	public void xuatTT() {
		System.out.println("+-------+-----------------------+---------------+-------+---------------+");
		super.xuatTT();
		System.out.println(new StringBuilder().append(tinhLuong()).append("\t|"));
	}
}
