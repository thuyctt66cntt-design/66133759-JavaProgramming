package tahty_26;
public class sinhvien {
	private String maSV;
    private String hoTen;
    private double diemTB;
    public sinhvien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    public String toString() {
        String res = "Ban: " + hoTen + " co mssv la " + maSV + " co diem trung binh la " + diemTB;
        return res;
    }
}