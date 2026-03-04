/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class TinhLuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Tạo đối tượng Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        // Bước 2: Nhập số giờ làm
        System.out.print("Nhập số giờ làm: ");
        double soGio = sc.nextDouble();
        // Bước 3: Nhập lương theo giờ
        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();
        // Bước 4: Khai báo biến tổng lương
        double tongLuong;
        // Bước 5: Kiểm tra nếu làm quá 40 giờ
        if (soGio > 40) {
            // 40 giờ đầu tính bình thường
            // Giờ vượt tính 1.5 lần
            tongLuong = 40 * luongGio 
                      + (soGio - 40) * luongGio * 1.5;
        } else {
            // Nếu không vượt thì tính bình thường
            tongLuong = soGio * luongGio;
        }
        // Bước 6: In kết quả
        System.out.println("Tổng lương: " + tongLuong + " đồng");
        // Bước 7: Đóng Scanner
        sc.close();
	}

}
