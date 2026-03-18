package tahty_26;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("NV01", "An", 5000000, 4);
        nv1.hienThiThongTin();

        System.out.println("--------------------");

        NhanVien nv2 = new NhanVien("NV02", "Bình", 5000000, 3);
        nv2.hienThiThongTin();

        System.out.println("--------------------");

        NhanVien nv3 = new NhanVien("NV03", "Cường", 4000000, 3);
        nv3.hienThiThongTin();

	}

}
