package tahty_26;

public class SanPham {
	private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    // Constructor mặc định
    public SanPham() {
    }

    // Constructor có tham số
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }

    // Getter & Setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Mã sản phẩm không được rỗng!");
        }
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Giá phải > 0!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng phải ≥ 0!");
        }
    }

    // Tính thành tiền
    public double tinhThanhTien() {
        return gia * soLuong;
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá: " + gia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }

}
