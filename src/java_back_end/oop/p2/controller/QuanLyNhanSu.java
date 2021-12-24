package java_back_end.oop.p2.controller;
import java.util.*;

import java_back_end.oop.p2.model.Congty;
import java_back_end.oop.p2.model.GiamDoc;
import java_back_end.oop.p2.model.NhanVien;
import java_back_end.oop.p2.model.TruongPhong;


public class QuanLyNhanSu {
	private List<NhanVien> qlnv;
	private List<TruongPhong> qltp;
	private List<GiamDoc> qlgd;
	private Scanner sc = new Scanner(System.in);
	
	
	public QuanLyNhanSu() {
		this.qlnv = new ArrayList<NhanVien>();
		this.qltp = new ArrayList<TruongPhong>();
		this.qlgd = new ArrayList<GiamDoc>();		
	}
	
	// Add Nhân Sự
	public void addNhanVien(NhanVien nv) {
		nv.nhapTT(sc);
		nv.tinhLuong();
		this.qlnv.add(nv);
	}

	public void addTruongPhong(TruongPhong tp) {
		tp.nhapTT(sc);
		tp.tinhLuong();
		this.qltp.add(tp);
	}
	
	public void addGiamDoc(GiamDoc gd) {
		gd.nhapTT(sc);
		gd.tinhLuong();
		this.qlgd.add(gd);
	}
	// ----------------------------------------
	
	// Add Trưởng Phòng cho Nhân Viên
	public void addTruongPhongChoNhanVien() {
		System.out.print("Nhập mã số của Trưởng Phòng đó : ");
		String mstp = sc.nextLine();
		boolean flag = false;
		for (TruongPhong tp: this.qltp) {
			if (mstp.toLowerCase().equals(tp.getMaso())) {
				System.out.print("Nhập mã số của Nhân Viên đó : ");
				String msnv = sc.nextLine();
				for (NhanVien nv: this.qlnv) {
					if (msnv.toLowerCase().equals(nv.getMaso())) {
						nv.setNameQuanLy(tp.getHoten());
						tp.setSonhanvien(tp.getSonhanvien()+1);	
						flag=true;
						break;
					}
				}
				break;
			}
		}
		if (flag) System.out.println("--->> add thành công <<");
		else System.out.println("--->> add ko thành công !!!\n"
							   +"--->> Kiểm tra lại mã Nhân Viên or Trưởng Phòng đã nhập đúng hay chưa <<");
	}
	// -------------------------------------------
	
	// Xuất thông tin tất cả các nhân sự của Cty
	public void xuatNhanSu() {
		System.out.println("+-----------------------> Danh sách nhân viên <-------------------------+");
		bang();
		// Xuất ds Nhân Viên
		if (!this.qlnv.isEmpty()) {
			for (NhanVien nv: this.qlnv) {
				nv.xuatTT();
			}	
		}
		else System.out.println("--->> Danh sách trống <<");
		System.out.println("+-----------------------------------------------------------------------+\n");
		System.out.println("+-----------------------> Danh sách trưởng phòng <----------------------+");
		bang();
		// Xuất ds Trưởng Phòng
		if (!this.qltp.isEmpty()) {
			for (TruongPhong tp: this.qltp) {
				tp.xuatTT();
			}
		}
		else System.out.println("--->> Danh sách trống <<");
		System.out.println("+-----------------------------------------------------------------------+\n");
		System.out.println("+-----------------------> Danh sách giám đốc <--------------------------+");
		bang();
		// Xuất ds Giám Đốc
		if (!this.qlgd.isEmpty()) {
			for (GiamDoc gd: this.qlgd) {
				gd.xuatTT();
			}
		}
		else System.out.println("--->> Danh sách trống <<");
		System.out.println("+-----------------------------------------------------------------------+");
	}
	// -------------------------------------------
	
	public void bang() {
		System.out.println("|Mã số\t|Họ & Tên\t\t|Số ĐT\t\t|Giờ\t|Tổng lương\t|");
	}

	// Delete
	public void removeNhanVien(boolean flag) {
		System.out.print("Nhập mã số của Nhân Viên bn muốn Xóa : ");
		String ms = sc.nextLine();
		Iterator<NhanVien> iterator = this.qlnv.iterator();
		while (iterator.hasNext()) {
		    NhanVien nv = iterator.next();
		    if (ms.toLowerCase().equals(nv.getMaso())) {
		    	flag = false;
		    	for (TruongPhong tp: this.qltp) {
					if (nv.getNameQuanLy().equals(tp.getHoten())) {
			        	tp.setSonhanvien(tp.getSonhanvien()-1);
			        	break;
					}
				}
		        iterator.remove();	 
		        System.out.println("--->> Đã cho chim cút nhân viên có mã số là "+ms+" trong danh sách");
		    }

		}
		if (flag) System.out.println("--->> Thất bại rồi !!!\n"
				   +"--->> Kiểm tra lại mã Nhân Viên đã nhập đúng hay chưa <<");
	}

	public void removeTruongPhong(boolean flag) {
		System.out.print("Nhập mã số của Trưởng Phòng bn muốn Xóa : ");
		String ms = sc.nextLine();
		Iterator<TruongPhong> iterator = this.qltp.iterator();
		while (iterator.hasNext()) {
		    TruongPhong tp = iterator.next();
		    if (ms.toLowerCase().equals(tp.getMaso())) {
		    	flag = false;
		    	for (NhanVien nv: this.qlnv) {
					if (nv.getNameQuanLy().equals(tp.getHoten())) {
			        	nv.setNameQuanLy("Ko có");
			        	break;
					}
				}
		        iterator.remove();	 
		        System.out.println("--->> Đã cho chim cút Trưởng Phòng có mã số là "+ms+" trong danh sách");
		    }

		}
		if (flag) System.out.println("--->> Thất bại rồi !!!\n"
				   +"--->> Kiểm tra lại mã Trưởng Phòng đã nhập đúng hay chưa <<");
	}

	public void removeGiamDoc(boolean flag) {
		System.out.print("Nhập mã số của Giám Đốc bn muốn Xóa : ");
		String ms = sc.nextLine();
		Iterator<GiamDoc> iterator = this.qlgd.iterator();
		while (iterator.hasNext()) {
		    GiamDoc gd = iterator.next();
		    if (ms.toLowerCase().equals(gd.getMaso())) {
		    	flag = false;
		        iterator.remove();	 
		        System.out.println("--->> Đã cho chim cút Trưởng Phòng có mã số là "+ms+" trong danh sách");
		    }

		}
		if (flag) System.out.println("--->> Thất bại rồi !!!\n"
				   +"--->> Kiểm tra lại mã Giám Đốc đã nhập đúng hay chưa <<");
	}
	// ------------------
	
	// tính tổng lương của Cty
	public double tongLuong() {
		double tongluong=0;
		for (NhanVien nv: this.qlnv) {
			tongluong = tongluong + nv.tinhLuong();
		}
		for (TruongPhong tp: this.qltp) {
			tongluong = tongluong + tp.tinhLuong();
		}
		for (GiamDoc gd: this.qlgd) {
			tongluong = tongluong + gd.tinhLuong();
		}
		return tongluong;
	}
	// ----------------------
	
	// Nhân Viên có lương cao nhất
	public void luongCaoNhat() {
		if (!this.qlnv.isEmpty()) {
			double t = this.qlnv.get(0).tinhLuong();
			int n=0;
			for (int i=1; i<this.qlnv.size(); i++) {
				if (t < this.qlnv.get(i).tinhLuong()) {
					t = this.qlnv.get(i).tinhLuong();
					n=i;
				}
			}
			System.out.println("Nhân Viên có lương cao nhất là NV "+this.qlnv.get(n).getHoten()+
					"\nMã số : "+this.qlnv.get(n).getMaso());
		}
		else System.out.println("--->> Danh sách Nhân Viên trống <<");
	}
	// -----------------------------
	
	// Trưởng Phòng quản lý nhiều nhân viên nhất
	public void quanLy() {
		if (!this.qltp.isEmpty()) {
			double t = this.qltp.get(0).getSonhanvien();
			int n=0;
			for (int i=1; i<this.qltp.size(); i++) {
				if (t < this.qltp.get(i).tinhLuong()) {
					t = this.qltp.get(i).tinhLuong();
					n=i;
				}
			}
			System.out.println("Trưởng Phòng quản lý nhiều Nhân Viên nhất là TP "+this.qltp.get(n).getHoten()+
					"\nMã số : "+this.qltp.get(n).getMaso());
		}
		else System.out.println("--->> Danh sách Trưởng Phòng trống <<");
	}
	// -----------------------------------------------
	
	// Sắp xếp danh sách theo thứ tự abc
	public void sapXepTheoKyTu() {
		// Sắp xếp danh sách Nhân Viên
		Collections.sort(this.qlnv, new Comparator<NhanVien>() {     
			@Override
			public int compare(NhanVien nv1, NhanVien nv2) {
				return nv1.getHoten().compareTo(nv2.getHoten());
			}
        });
		// Sắp xếp danh sách Trưởng Phòng
		Collections.sort(this.qltp, new Comparator<TruongPhong>() {     
			@Override
			public int compare(TruongPhong tp1, TruongPhong tp2) {
				return tp1.getHoten().compareTo(tp2.getHoten());
			}
        });
		// Sắp xếp danh sách Giám Đốc
		Collections.sort(this.qlgd, new Comparator<GiamDoc>() {     
			@Override
			public int compare(GiamDoc gd1, GiamDoc gd2) {
				return gd1.getHoten().compareTo(gd2.getHoten());
			}
        });
		System.out.println("--->> Đã sắp xếp xong <<");
	}
	// -----------------------------------------
	
	// Sắp xếp danh sách theo lương giảm giần
	public void sapXepTheoLuong() {
			// Sắp xếp danh sách Nhân Viên
			Collections.sort(this.qlnv, new Comparator<NhanVien>() {     
				@Override
				public int compare(NhanVien nv1, NhanVien nv2) {
					if (nv1.tinhLuong() < nv2.tinhLuong()) {
	                    return 1;
	                } else {
	                    if (nv1.tinhLuong() == nv2.tinhLuong()) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
			// Sắp xếp danh sách Trưởng Phòng
			Collections.sort(this.qltp, new Comparator<TruongPhong>() {     
				@Override
				public int compare(TruongPhong tp1, TruongPhong tp2) {
					if (tp1.tinhLuong() < tp2.tinhLuong()) {
	                    return -1;
	                } else {
	                    if (tp1.tinhLuong() == tp2.tinhLuong()) {
	                        return 0;
	                    } else {
	                        return 1;
	                    }
	                }
				}
	        });
			// Sắp xếp danh sách Giám Đốc
			Collections.sort(this.qlgd, new Comparator<GiamDoc>() {     
				@Override
				public int compare(GiamDoc gd1, GiamDoc gd2) {
					if (gd1.tinhLuong() < gd2.tinhLuong()) {
	                    return -1;
	                } else {
	                    if (gd1.tinhLuong() == gd2.tinhLuong()) {
	                        return 0;
	                    } else {
	                        return 1;
	                    }
	                }
				}
	        });
			System.out.println("--->> Đã sắp xếp xong <<");
		}
	// -----------------------------------------
		
	// Tìm giám đốc có cổ phần nhiều nhất
	public void coPhan() {
		if (!this.qlgd.isEmpty()) {
			double t = this.qlgd.get(0).getCophan();
			int n=0;
			for (int i=1; i<this.qlgd.size(); i++) {
				if (t < this.qlgd.get(i).getCophan()) {
					t = this.qlgd.get(i).getCophan();
					n=i;
				}
			}
			System.out.println("Giám Đốc có nhiều cổ phần nhất là GĐ "+this.qlgd.get(n).getHoten()+
					"\nMã số : "+this.qlgd.get(n).getMaso());
		}
		else System.out.println("--->> Danh sách Giám Đốc trống <<");
	}
	// ---------------------------------
	
	// Tính lương cho giám đốc sau khi + thêm thu nhập từ cổ phần
	public void luongGiamDoc(Congty ct) {
		if (!this.qlgd.isEmpty()) {
			double thai=0;
			System.out.println("--->> Lương sau khi + thêm lợi nhuận từ cổ phần đầu tư\n");
			for (GiamDoc gd: this.qlgd) {
				thai = gd.tinhLuong() + gd.getCophan() * (ct.getDoanhthuthang()-tongLuong());
				System.out.println("-->> Giám Đốc "+gd.getHoten()+"\t  Mã Số "+gd.getMaso());
				System.out.println("-->> Tổng Lương : "+thai+"\n");
			}
		}
		else System.out.println("--->> Danh sách Giám Đốc trống <<");
	}
	// --------------------------------------------------
}
