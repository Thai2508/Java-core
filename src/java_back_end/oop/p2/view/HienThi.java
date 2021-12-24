package java_back_end.oop.p2.view;

import java.util.*;

import java_back_end.oop.p2.controller.QuanLyNhanSu;
import java_back_end.oop.p2.model.Congty;
import java_back_end.oop.p2.model.GiamDoc;
import java_back_end.oop.p2.model.NhanSu;
import java_back_end.oop.p2.model.NhanVien;
import java_back_end.oop.p2.model.TruongPhong;

public class HienThi {

	static Scanner sc = new Scanner(System.in);
	public static void start() {
		boolean flag = true;
		QuanLyNhanSu ns = new QuanLyNhanSu();
		Congty ct = new Congty();
		NhanVien nv = new NhanVien();
		TruongPhong tp = new TruongPhong();
		GiamDoc gd = new GiamDoc();
		NhanSu x = new NhanSu();
		do {
			thongBao();
			int lc = Integer.parseInt(sc.nextLine());
			System.out.println();
		switch (lc) {
		case 1:
			ct.nhapCTy();
			break;
		case 2:
			ct.xuatCTy();
			break;
		case 3:
			System.out.println("Bạn Muốn Thêm Ai ???"
					+ "\n\t1. Nhân Viên"
					+ "\t2. Trưởng Phòng"
					+ "\t   3. Giám Đốc"
					+ "\t   0. Quay Trở Lại Menu");
			case2(ns, flag);
			break;
		case 4:
			System.out.println("Bạn Muốn Xóa Ai ???"
					+ "\n\t1. Nhân Viên"
					+ "\t2. Trưởng Phòng"
					+ "\t   3. Giám Đốc"
					+ "\t   0. Quay Trở Lại Menu");
			case4(ns, flag);
			break;
		case 5:
			ns.addTruongPhongChoNhanVien();
			break;
		case 6:
			ns.xuatNhanSu();
			break;
		case 7:
			System.out.println("Tổng lương của toàn công ty : "+ns.tongLuong());
			break;
		case 8:
			ns.luongCaoNhat();
			break;
		case 9:
			ns.quanLy();
			break;
		case 10:
			ns.sapXepTheoKyTu();
			break;
		case 11:
			ns.sapXepTheoLuong();
			break;
		case 12:
			ns.coPhan();
			break;
		case 13:
			ns.luongGiamDoc(ct);
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("Wrong Number !!!");
			break;
		}
		
		} while (flag);
	}
	
	static void thongBao() {
		System.out.println("\n--------------------------------> WELCOME TO MY CODE <--------------------------");
		System.out.println("---------> 01. Nhập thông tin công ty");
		System.out.println("---------> 02. Xuất thông tin công ty");
		System.out.println("---------> 03. Add nhân sự");
		System.out.println("---------> 04. Xóa nhân sự");
		System.out.println("---------> 05. Add Trưởng Phòng cho Nhân Viên");
		System.out.println("---------> 06. Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("---------> 07. Tính và xuất tổng lương cho toàn công ty");
		System.out.println("---------> 08. Tìm Nhân viên thường có lương cao nhất");
		System.out.println("---------> 09. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("---------> 10. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("---------> 11. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("---------> 12. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
		System.out.println("---------> 13. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("---------> 00. Thoát");
		System.out.println("-------------------------------> WHAT DO U WANT TO DO <--------------------------");
		System.out.print("---------> Chọn Chức Năng Bạn Muốn Sử Dụng : ");
	}

	// Chức năng 2
	static void case2(QuanLyNhanSu ns,boolean flag) {
		do {
			System.out.print("Nhập lựa chọn của bn : ");
			int n = Integer.parseInt(sc.nextLine());
		switch (n) {
		case 1:
			NhanVien nv = new NhanVien();
			ns.addNhanVien(nv);
			case22();
			break;
		case 2:
			TruongPhong tp = new TruongPhong();	
			ns.addTruongPhong(tp);
			case22();
			break;
		case 3:
			GiamDoc gd = new GiamDoc();
			ns.addGiamDoc(gd);
			case22();
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("\nWrong Number !!!");
			break;
		}
		} while (flag);
	}
	static void case22() {
		System.out.println("\nOne more or not ???"
				+ "\n\t1. add Nhân Viên"
				+ "\t2. add Trưởng Phòng"
				+ "\t   3. add Giám Đốc"
				+ "\t   0. Quay Trở Lại Menu");
	}
	// ---------------------------------
	
	// Chức năng 4
	static void case4(QuanLyNhanSu ns,boolean flag) {
		do {
			System.out.print("Nhập lựa chọn của bn : ");
			int n = Integer.parseInt(sc.nextLine());
		switch (n) {
		case 1:
			ns.removeNhanVien(flag);
			case44();
			break;
		case 2:
			ns.removeTruongPhong(flag);
			case44();
			break;
		case 3:
			ns.removeGiamDoc(flag);
			case44();
			break;
		case 0:
			flag = false;
			break;
		default:
			System.out.println("\nWrong Number !!!");
			break;
		}
	   }while (flag);
	}
	static void case44() {
			System.out.println("\nOne more or not ???"
					+ "\n\t1. delete Nhân Viên"
					+ "\t2. delete Trưởng Phòng"
					+ "\t   3. delete Giám Đốc"
					+ "\t   0. Quay Trở Lại Menu");
	}
	// --------------------------------
	
}
