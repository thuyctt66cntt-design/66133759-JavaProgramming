package thigk2_ChuThiThanhThuy;
import java.util.Scanner;

public class ChuViDienTichHCN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // Nhập tọa độ
        System.out.print("Nhap x1, y1 (goc tren trai): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Nhap x2, y2 (goc duoi phai): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
     // Tính chiều dài và chiều rộng
        double chieuDai = Math.abs(x2 - x1);
        double chieuRong = Math.abs(y1 - y2);

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);	
		

	}

}
