package java_back_end.oop.p2.model;

import java.util.Scanner;

public class GiamDoc extends NhanSu{
	private float cophan;

	public float getCophan() {
		return cophan;
	}

	public void setCophan(float cophan) {
		this.cophan = cophan;
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

	@Override
	public void nhapTT(Scanner sc) {
		super.nhapTT(sc);
		System.out.print("Nhập Cổ Phần (%) : ");
		this.cophan = Float.parseFloat(sc.nextLine()) ;
	}
}
