package tahty_26;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo sản phẩm hợp lệ
        SanPham sp1 = new SanPham("SP01", "Bánh", 10000, 5);
        sp1.hienThiThongTin();

        System.out.println("--------------------");

        // Test dữ liệu sai (validation)
        SanPham sp2 = new SanPham("", "Nước", -5000, -2);
        sp2.hienThiThongTin();

	}

}
