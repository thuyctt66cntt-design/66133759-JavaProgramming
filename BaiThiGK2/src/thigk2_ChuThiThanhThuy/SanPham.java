package thigk2_ChuThiThanhThuy;

public class SanPham {
	private String maSP;
    private String tenSP;
    private String loaiSP;
    private double gia; // thuộc tính thêm

    // constructor không tham số
    public SanPham() {

    }

    // constructor đầy đủ tham số
    public SanPham(String maSP, String tenSP, String loaiSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.gia = gia;
    }

    // getter setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", gia=" + gia + "]";
    }
}
