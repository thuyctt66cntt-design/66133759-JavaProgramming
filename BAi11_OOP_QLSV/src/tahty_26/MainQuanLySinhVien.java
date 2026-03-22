package tahty_26;

import java.util.List;

public class MainQuanLySinhVien {
 public static void main(String[] args) {
     System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n"); 
     QuanLySinhVien qlsv = new QuanLySinhVien();
     qlsv.themsinhvien(new sinhvien("SV001", "Nguyễn Văn A", 8.5));
     qlsv.themsinhvien(new sinhvien("SV002", "Trần Thị B", 7.2));
     qlsv.themsinhvien(new sinhvien("SV003", "Lê Văn C", 6.8));
     qlsv.themsinhvien(new sinhvien("SV004", "Phạm Thị D", 9.1));
     qlsv.themsinhvien(new sinhvien("SV005", "Hoàng Văn E", 5.5));
     
     // Hiển thị danh sách
     qlsv.hienThiDanhSach();
     
     // Tìm sinh viên
     System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
     sinhvien sv = qlsv.timTheoMa("SV003");
     System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));
     
     // Tìm điểm cao nhất
     System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
     sinhvien svCaoNhat = qlsv.timDiemCaoNhat();
     System.out.println(svCaoNhat != null ? svCaoNhat : "Không có sinh viên");
     // Tính điểm trung bình lớp
     System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
     // Lọc sinh viên
     System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
     List<sinhvien> svGioi = qlsv.locsinhvienTheoDiem(8.0);
     if (!svGioi.isEmpty()) {
         svGioi.forEach(System.out::println);
     } else {
         System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
     }
     
     // Sắp xếp
     System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
     qlsv.sapXepTheoDiem();
     qlsv.hienThiDanhSach();
     
     // Xóa sinh viên
     System.out.println("\n=== XÓA SINH VIÊN ===");
     qlsv.xoasinhvien("SV002");
     qlsv.hienThiDanhSach();
     
     // Sử dụng subList
     qlsv.hienThiHaisinhvienDauTien();
 }
}