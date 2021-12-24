package java_back_end.oop.p2.model;

import java.util.Scanner;

public class NhanVien extends NhanSu{
	private String nameQuanLy = "Ko có";
	

	public String getNameQuanLy() {
		return nameQuanLy;
	}

	public void setNameQuanLy(String nameQuanLy) {
		this.nameQuanLy = nameQuanLy;
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong();	
	}

	@Override
	public void xuatTT() {
		System.out.println("+-------+-----------------------+---------------+-------+---------------+");
		super.xuatTT();
		System.out.println(new StringBuilder().append(tinhLuong()).append("\t|"));
	}

	

	
	
}
