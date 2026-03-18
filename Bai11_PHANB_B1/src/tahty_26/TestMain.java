package tahty_26;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		QuanLySanPham ql = new QuanLySanPham();

        ql.themSanPham(new SanPham("SP01", "Bánh", 10000, 5));
        ql.themSanPham(new SanPham("SP02", "Nước", 8000, 20));
        ql.themSanPham(new SanPham("SP03", "Sữa", 15000, 8));

        System.out.println("Danh sách sản phẩm:");
        ql.hienThiAll();

        System.out.println("\nTìm 'bánh':");
        ql.timTheoTen("bánh");

        System.out.println("\nSắp xếp tăng:");
        ql.sapXepTang();
        ql.hienThiAll();

        System.out.println("\nTổng giá trị kho:");
        System.out.println(ql.tongGiaTri());

        System.out.println("\nSản phẩm sắp hết hàng:");
        ql.sapHetHang();

	}

}
