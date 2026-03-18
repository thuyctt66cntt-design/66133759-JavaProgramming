package tahty_26;

public class NhanVien {
	private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    // Constructor có tham số
    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Getter & Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    // Tính lương
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Xếp loại
    public String xepLoai() {
        double luong = tinhLuong();

        if (luong >= 20000000) {
            return "Xuất sắc";
        } else if (luong >= 15000000) {
            return "Tốt";
        } else {
            return "Khá";
        }
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương: " + tinhLuong());
        System.out.println("Xếp loại: " + xepLoai());
    }

}
