/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class giaiphuongtrinhbac1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Tạo Scanner
        Scanner sc = new Scanner(System.in);

        // Bước 2: Nhập a
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        // Bước 3: Nhập b
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        // Bước 4: Xét các trường hợp
        if (a != 0) {
            // Có 1 nghiệm
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        } 
        else {
            if (b != 0) {
                System.out.println("Phương trình vô nghiệm");
            } 
            else {
                System.out.println("Phương trình có vô số nghiệm");
            }
        }

        // Bước 5: Đóng Scanner
        sc.close();

	}

}
