package tahty_26;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SinhVien.TEN_TRUONG);
		SinhVien.sayHi();
		System.out.println();
		SinhVien sv1 = new SinhVien("Chu Thị Thanh Thuy", "CNTT3");
		SinhVien sv2 = new SinhVien("Võ Thị Kim Phấn", "CNTT3");
		sv1.sayHello();
		sv2.sayHello();

	}

}
