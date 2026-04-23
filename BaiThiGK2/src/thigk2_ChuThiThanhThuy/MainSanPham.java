package thigk2_ChuThiThanhThuy;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSanPham {

    public static void main(String[] args) {
        // Hardcode 3 sản phẩm
        ArrayList<SanPham> ds = new ArrayList<>();

        SanPham sanPham1 = new SanPham("SP01", "Ban phim co", "Thiet bi", 100.0);
        SanPham sanPham2 = new SanPham("SP02", "Sua tang suc de khang", "Thuc pham chuc nang", 50.0);
        SanPham sanPham3 = new SanPham("SP03", "Man hinh LCD", "Thiet bi", 200.0);

        // thêm vào danh sách
        ds.add(sanPham1);
        ds.add(sanPham2);
        ds.add(sanPham3);

        // In danh sách ban đầu
        System.out.println("Danh sach san pham ban dau:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }

        // THÊM MỚI 1 SẢN PHẨM 
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap san pham moi:");
        System.out.print("Ma SP: ");
        String ma = sc.nextLine();

        System.out.print("Ten SP: ");
        String ten = sc.nextLine();

        System.out.print("Loai SP: ");
        String loai = sc.nextLine();

        System.out.print("Gia: ");
        double gia = sc.nextDouble(); // sửa thành double

        // tạo đối tượng mới
        SanPham sanPham4 = new SanPham(ma, ten, loai, gia);
        ds.add(sanPham4);

        // xuất sản phẩm vừa thêm
        System.out.println("San pham vua them: " + sanPham4);

        // In lại danh sách
        System.out.println("\nDanh sach san pham sau khi them:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }

        // Lọc theo loại
        System.out.println("\nDanh sach san pham loai 'thuc pham chuc nang':");
        for (SanPham sp : ds) {
            if (sp.getLoaiSP().equalsIgnoreCase("thuc pham chuc nang")) {
                System.out.println(sp);
            }
        }
    }
}
