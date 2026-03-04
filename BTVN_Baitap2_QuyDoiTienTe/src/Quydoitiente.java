/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Quydoitiente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Tạo Scanner
        Scanner sc = new Scanner(System.in);
        // Bước 2: Nhập số tiền USD
        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();
        // Bước 3: Nhập số tiền EUR
        System.out.print("Nhập số tiền EUR: ");
        double eur = sc.nextDouble();
        // Bước 4: Tính tiền VND
        double vndFromUSD = usd * 23500;
        double vndFromEUR = eur * 27000;
        // Bước 5: In kết quả
        System.out.println("Tiền VND từ USD: " + vndFromUSD + " VND");
        System.out.println("Tiền VND từ EUR: " + vndFromEUR + " VND");
        // Bước 6: Đóng Scanner
        sc.close();
	}

}
