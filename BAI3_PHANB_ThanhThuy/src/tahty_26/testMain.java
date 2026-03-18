package tahty_26;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Diem d1 = new Diem(2, 3);
	        Diem d2 = new Diem(5, 7);

	        // Hiển thị điểm
	        System.out.print("Điểm d1: ");
	        d1.hienThi();

	        System.out.print("Điểm d2: ");
	        d2.hienThi();

	        // Tính khoảng cách
	        System.out.println("Khoảng cách: " + d1.tinhKhoangCach(d2));

	        // Kiểm tra trùng nhau
	        if (d1.kiemTraTrungNhau(d2)) {
	            System.out.println("Hai điểm trùng nhau");
	        } else {
	            System.out.println("Hai điểm không trùng nhau");
	        }

	        // Điểm đối xứng
	        Diem dx = d1.doiXungQuaGoc();
	        System.out.print("Điểm đối xứng của d1: ");
	        dx.hienThi();

	}

}
