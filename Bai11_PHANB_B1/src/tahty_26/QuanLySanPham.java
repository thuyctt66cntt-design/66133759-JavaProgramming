package tahty_26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySanPham {
	    private ArrayList<SanPham> ds = new ArrayList<>();

	    // Thêm sản phẩm
	    public void themSanPham(SanPham sp) {
	        ds.add(sp);
	    }

	    // Xóa theo mã
	    public void xoaSanPham(String ma) {
	        ds.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(ma));
	    }

	    // Tìm theo tên (gần đúng)
	    public void timTheoTen(String ten) {
	        for (SanPham sp : ds) {
	            if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
	                sp.hienThi();
	            }
	        }
	    }

	    // Sắp xếp tăng dần theo giá
	    public void sapXepTang() {
	        Collections.sort(ds, Comparator.comparingDouble(SanPham::getGia));
	    }

	    // Sắp xếp giảm dần
	    public void sapXepGiam() {
	        Collections.sort(ds, (a, b) -> Double.compare(b.getGia(), a.getGia()));
	    }

	    // Tổng giá trị kho
	    public double tongGiaTri() {
	        double tong = 0;
	        for (SanPham sp : ds) {
	            tong += sp.tinhThanhTien();
	        }
	        return tong;
	    }

	    // Sản phẩm sắp hết hàng (<10)
	    public void sapHetHang() {
	        for (SanPham sp : ds) {
	            if (sp.getSoLuong() < 10) {
	                sp.hienThi();
	            }
	        }
	    }

	    // Hiển thị tất cả
	    public void hienThiAll() {
	        for (SanPham sp : ds) {
	            sp.hienThi();
	        }
	    }

}
