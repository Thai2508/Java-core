import java.util.*;

public class First_poject {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag = true;
		int lc;
		do {
			thongBao();
			lc = sc.nextInt();
			switch (lc) {
			case 1:
				Flag();
				break;
			case 2:
				nhiPhan();
				break;
			case 3:
				In();
				break;
			case 4:
				Tong();
				break;
			case 5:
				tinhAB();
				break;
			case 6:
				daoNguoc();
				break;
			case 7:
				uocSo();
				break;
			case 8:
				inHoaChuCaiDau();
				break;
			case 9:
				System.out.print(Check());
				break;
			case 10:
				tongCacSNT();
				break;
			case 11:
				System.out.println("----> Chịu");
				break;
			case 12:
				tamGiac();
				break;
			case 13:
				Bai13();
				break;
			case 14:
				xoaCacPhanTuLapLai();
				break;
			case 15:
				kyTu();
				break;
			case 16:
				System.out.println("----> Chịu");
				break;
			case 17:
				gameThuvi();
				break;
			case 18:
				anhX();
				break;
			case 19:
				giaiPT();
				break;
			case 20:
				tach2Mang();
				break;
			case 21:
				Kangaru();
				break;
			case 22:
				
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập sai nhập dùm lại cái");
				break;
			}
		} while (flag);
	
	}
	static void thongBao() {
		System.out.print("\n\n-----------------------> Welcome To My Code <------------------------\n"
						+"\t01. In quốc kỳ Mỹ\n"
						+"\t02. Chuyển đổi số từ hệ cơ số 10 sang nhị phân\n"
						+"\t03. In ra các thông tin của máy tính\n"
						+"\t04. In ra tổng các chữ số của số tự nhiên đó\n"
						+"\t05. Tính và in ra độ dài đoạn thẳng AB\n"
						+"\t06. In ra chuỗi theo thứ tự ngược lại\n"
						+"\t07. In ra các ước số\n"
						+"\t08. In ra chuỗi có ký tự đầu in hoa\n"
						+"\t09. Kiểm tra VD: (12, 81) => true && (23, 89) => false \n"
						+"\t10. In ra tổng các số nguyên tố\n"
						+"\t11. Log2n chịu\n"
						+"\t12. In ra tam giác vuông\n"
						+"\t13. Mảng 1 nùi\n"
						+"\t14. Xóa đi các phần tử bị lặp lại.\n"
						+"\t15. Chuỗi 1 nùi\n"
						+"\t16. Năm chịu \n"
						+"\t17. Game thú vị\n"
						+"\t18. Anh X gửi tiền ngân hàng\n"
						+"\t19. PT bậc 1 && 2\n"
						+"\t20. Chia mảng: một mảng chẵn + một mảng lẻ\n"
						+"\t21. Chú kangaru vui vẻ\n"
						+"\t22. Super Idol\n"
						+"\t00. Thoát\n"
						+"----------------------> Nhập lựa chọn của bn <-----------------------\n");
	}
	
	// Bài 1
	static void Flag() {
		System.out.print("\t* * * * * * ====================="
					  +"\n\t * * * * *  ====================="
					  +"\n\t* * * * * * ====================="
					  +"\n\t================================="
					  +"\n\t================================="
					  +"\n\t=================================");
	}

	// Bài 2
	static void nhiPhan() {
		Stack<Integer>s = new Stack<Integer>();
		System.out.print("Num : ");
		int n = sc.nextInt();
		
		while (n > 0) {			
			s.add(n%2);
			n/=2;	
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		
	}

	// Bài 3
	static void In() {
		System.out.print("\t\t-------------------------------------------------------------------------------------------"
					   + "\n\t\t|\t\t● Java Version : 1.8.0_71                                                 |"
					   + "\n\t\t|\t\t● Java Runtime Version : 1.8.0_71-b15                                     |"
					   + "\n\t\t|\t\t● Java Home : /opt/jdk/jdk 1.8.0_71/jre                                   |"
					   + "\n\t\t|\t\t● Java Vendor : Oracle Corporation                                        |"
					   + "\n\t\t|\t\t● Java Vendor URL : http://Java.oracle.com/                               |"
					   + "\n\t\t|\t\t● Java Class Path : .....................                                 |"
					   + "\n\t\t-------------------------------------------------------------------------------------------");
	}

	// Bài 4
	static void Tong() {
		System.out.print("Num : ");
		int n = sc.nextInt();
		
		int t=0,i=1;
		while (t < n) {
			t+=i;
			System.out.print(i+" ");
		}
		
	}

	// Bài 5
	static void tinhAB() {
		System.out.print("Num x1 : ");
		int x1 = sc.nextInt();
		System.out.print("Num y1 : ");
		int y1 = sc.nextInt();
		System.out.print("Num x2 : ");
		int x2 = sc.nextInt();
		System.out.print("Num y2 : ");
		int y2 = sc.nextInt();
		
		int a = (x2-x1)*(x2-x1);
		int b = (y2-y1)*(y2-y1);
		
		double AB = Math.sqrt(a+b);
		System.out.print("Độ dài = "+AB);
	}

	// Bài 6
	static void daoNguoc() {
		System.out.print("Nhập 1 cái j đó : ");
		Stack<Character>s = new Stack<Character>();
		String str = sc.next();
		
		for (int i=0; i<str.length(); i++) {
			s.add(str.charAt(i));
		}
		
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
		
	}

	// Bài 7
	static void uocSo() {
		System.out.print("Num : ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0)
				System.out.print(i+" ");
		}
	}
	
	// Bài 8
	static void inHoaChuCaiDau() {
		System.out.print("Nhập 1 cái j đó : ");
		String str = sc.next();		
		
		System.out.print(str.toUpperCase().charAt(0));
		for (int i=1; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

	// Bài 9
	static boolean Check() {
		System.out.print("Num 1 : ");
		int x1 = sc.nextInt();
	
		System.out.print("Num 2 : ");
		int x2 = sc.nextInt();
		
		if (x1 > 9 && x1 <100 && x2 > 9 && x2 <100) {
			int t = x1 % 10;
			int t1 = x1 / 10;
			
			int k = x2 % 10;
			int k1 = x2 / 10;
			
			if (t1 == k || t1 == k1 || t == k || t == k1)
				return true;
		}
			
		return false;
	}

	// Bài 10
	static void tongCacSNT() {
		System.out.print("Num : ");
		int n = sc.nextInt();
		
		int t=0;
		for (int i=2; i<n; i++) {
			if (ktSNT(i)) {
				t+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n"+t);
	}
	static boolean ktSNT(int n) {
		if (n < 2) return false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	// Bài 11
	
	// Bài 12
	static void tamGiac() {
		System.out.print("Num : ");
		int n = sc.nextInt();
		
		if (n > 0 && n < 10) {
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
	}

	// Bài 13
	static void Bai13() {
		System.out.print("Nhập số lượng phần tử : ");
		int n = sc.nextInt();
		int []a = new int[100];
		
		System.out.println("Nhập các phần tử : ");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		// Tính giá trị trung bình của mảng
		double t=0;
		for (int i=0; i<n; i++) {
			t+=a[i];
		}
		System.out.println("Giá trị trung bình : "+t/n);
		
		// Tìm phần tử lớn nhất, nhỏ nhất
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Max = "+a[n-1]+"\t\tMin = "+a[0]);
		
		// Tìm phần tử âm và dương lớn nhất, nhỏ nhất trong mảng
		LinkedList<Integer>l1 = new LinkedList<Integer>();
		LinkedList<Integer>l2 = new LinkedList<Integer>();
		for (int i=0; i<n; i++) {
			if (a[i] < 0)
				l1.add(a[i]);
			else l2.add(a[i]);
		}
		if (l1.isEmpty()) {
			System.out.println("Ko có phần tử âm");
		}
		else System.out.println("Âm min = "+l1.getFirst()+"\t\tÂm max = "+l1.getLast());
		if (l2.isEmpty()) {
			System.out.println("Ko có phần tử dương");
		}
		else System.out.println("Dương min = "+l2.getFirst()+"\t\tDương max = "+l2.getLast());
		
		// In ra các phần tử chẵn, lẻ
		System.out.print("Số chẵn : ");
		for (int i=0; i<n; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i]+" ");
		}
		System.out.print("\tSố lẻ : ");
		for (int i=0; i<n; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
		// Thêm hoặc Xóa 1 phần tử theo index
		System.out.print("Nhập vị trí muốn Thêm : ");
		int k = sc.nextInt();
		if (k >=0 && k<=n) {
			System.out.print("Nhập số muốn thêm : ");
			int x = sc.nextInt();
			for (int i=n; i>=k+1; i--) {
				a[i] = a[i-1];
			}
			a[k] = x;
			n++;
		}
		System.out.print("Nhập vị trí muốn Xóa : ");
		int m = sc.nextInt();
		if (m >=0 && m<=n) {
			for (int i=m; i<n-1; i++) {
				a[i] = a[i+1];
			}
			n--;
		}
		
		for (int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	// Bài 14
	static void xoaCacPhanTuLapLai() {
		System.out.print("Nhập số lượng phần tử : ");
		int n = sc.nextInt();
		int []a = new int[n];
		
		System.out.println("Nhập các phần tử : ");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.print(a[0]+" ");
		for (int i=1; i<n; i++) {
			
				for (int j=i-1; j<=i-1; j++) {
					if (a[j] != a[i])
						System.out.print(a[i]+" ");
				}	
				
			
		}
		
	}

	// Bài 15
	static void kyTu() {
		System.out.print("Nhập 1 cái j đó : ");
		String str = sc.next();
		
		System.out.println("Chuỗi có "+str.length()+" ký tự");
		
		System.out.print("Chọn vị trí ký tự muốn in : ");
		int n = sc.nextInt();
		System.out.println("Vị trí "+n+" có ký tự là "+str.charAt(n));
		
		int thai = str.indexOf("abcdef");
		if (thai >= 0)
			System.out.println("True");
		else System.out.println("False");
		
	}

	// Bài 16
	
	// Bài 17
	static void gameThuvi() {
		Random r = new Random();
		int t = r.nextInt(1000)+1;
		
		boolean flag = false;
		do {
			System.out.print("Num : ");
			int n = sc.nextInt();
			
			if (t == n) {
				System.out.println("Right");
				flag = true;
			}
			if (n > t)
				System.out.println("Lớn hơn rồi !!!");
			if (n < t)
				System.out.println("Bé hơn rồi !!!");
		} while (!flag);
	}

	// Bài 18
	static void anhX() {
		System.out.print("Số tiền anh X có : ");
		double n = sc.nextInt();
		System.out.print("Số tiền anh X mong muốn : ");
		double m = sc.nextInt();
		
		int count=0;
		while (true) {
				n = n + n*0.01; 
				count++;	
			if (n >= m)
				break;
		}
		System.out.println("Cần "+count+" tháng để anh X đạt dc số tiền mong muốn");
	}

	// Bài 19
	static void ptBac1(double a, double b, double x) {
		// PT bậc 1
		if (a == 0 && b == 0)
			System.out.println("x ∈ R");
		if (a == 0 && b != 0)
			System.out.println("PT vô nghiệm");
		if (a != 0) {
			x = -b/a;
			System.out.println("PT có nghiệm là : "+x);
		}
	}
	static void ptBac2(double a, double b, double c, double x) {
		if (a == 0)
			ptBac1(b, c, x);
		if (a != 0) {
			x = b*b - 4*a*c;
			if (x > 0)
				System.out.println("PT có 2 nghiệm \n"+"x1 = "+( (-b+Math.sqrt(x)) /(2*a)  )+ "\t\tx2 = "+( (-b-Math.sqrt(x)) /(2*a)  ));
			if (x == 0)
				System.out.println("PT có nghiệm kép x1 = x2 = "+(-b/(2*a)));
			if (x < 0)
				System.out.println("PT vô nghiệm");
		}
	}
	static void giaiPT() {
		System.out.print("Nhập a : ");
		double a = sc.nextInt();
		System.out.print("Nhập b : ");
		double b = sc.nextInt();
		double x = 0;
		
		System.out.println("1. pt bậc 1 \t\t2. pt bậc 2");
		int lc = sc.nextInt();
		switch (lc) {
		case 1:
			ptBac1(a, b, x);
			break;
		case 2:
			System.out.print("Nhập c : ");
			double c = sc.nextInt();
			ptBac2(a, b, c, x);
			break;

		default:
			System.out.println("---> CÚT !!");
			break;
		}	
	}

	// Bài 20
	static void tach2Mang() {
		System.out.print("Nhập số phần tử : ");
		int n = sc.nextInt();
		int []a = new int[n];
		
		System.out.println("Nhập phần tử");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int []k = new int[n];
		int c = 0;
		int []t = new int[n];
		int l = 0;
		for (int i=0; i<n; i++) {
			if (a[i] % 2 == 0) {
				k[c] = a[i];
				c++;
			}
			else {
				t[l] = a[i];
				l++;
			}		
		}
		System.out.print("Chẵn : ");
		for (int i=0; i<c; i++) {
			System.out.print(k[i]+" ");
		}
		System.out.print("\nLẻ : ");
		for (int i=0; i<l; i++) {
			System.out.print(t[i]+" ");
		}
	}
	
	// Bài 21
	static void Kangaru() {
		System.out.print("Nhập vị trí ban đầu của con thứ 1 : ");
		int x1 = sc.nextInt();
		System.out.print("Nhập vị trí ban đầu của con thứ 2 : ");
		int x2 = sc.nextInt();
		System.out.print("Nhập tốc độ của con thứ 1 : ");
		int v1 = sc.nextInt();
		System.out.print("Nhập tốc độ của con thứ 2 : ");
		int v2 = sc.nextInt();
		
		boolean flag = false;
		if (x1 >= 0 && x2 > x1 && x2 < 10000 && v1 >= 1 && v2 <= 10000) {
			while (x2 < 10000) {
				x1 = x1 + v1;
				x2 = x2 + v2;
				if (x1 == x2) {
					flag = true;
					System.out.print("Vị trí 2 con gặp nhau : "+x2+" bước nhảy");
				}
			}
		}
		if (!flag)
			System.out.print("Ko gặp dc nhau");
	}

	// Bài 22
	
	
}
