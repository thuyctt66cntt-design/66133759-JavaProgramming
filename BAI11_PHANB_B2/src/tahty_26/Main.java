package tahty_26;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        // 1. Nhập danh sách
	        System.out.print("Nhập số lượng phần tử: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("a[" + i + "] = ");
	            list.add(sc.nextInt());
	        }

	        System.out.println("Danh sách ban đầu: " + list);

	        // 2. Xóa trùng (giữ lần đầu)
	        ArrayList<Integer> khongTrung = new ArrayList<>();
	        for (Integer x : list) {
	            if (!khongTrung.contains(x)) {
	                khongTrung.add(x);
	            }
	        }
	        System.out.println("Sau khi xóa trùng: " + khongTrung);

	        // 3. Tìm số lớn thứ 2
	        int max1 = Integer.MIN_VALUE;
	        int max2 = Integer.MIN_VALUE;

	        for (int x : khongTrung) {
	            if (x > max1) {
	                max2 = max1;
	                max1 = x;
	            } else if (x > max2 && x != max1) {
	                max2 = x;
	            }
	        }

	        if (max2 == Integer.MIN_VALUE) {
	            System.out.println("Không có số lớn thứ 2");
	        } else {
	            System.out.println("Số lớn thứ 2: " + max2);
	        }

	        // 4. Trung bình cộng số chẵn
	        int tongChan = 0, demChan = 0;
	        for (int x : list) {
	            if (x % 2 == 0) {
	                tongChan += x;
	                demChan++;
	            }
	        }

	        if (demChan > 0) {
	            System.out.println("TBC số chẵn: " + (tongChan * 1.0 / demChan));
	        } else {
	            System.out.println("Không có số chẵn");
	        }

	        // 5. Tách chẵn - lẻ
	        ArrayList<Integer> chan = new ArrayList<>();
	        ArrayList<Integer> le = new ArrayList<>();

	        for (int x : list) {
	            if (x % 2 == 0) {
	                chan.add(x);
	            } else {
	                le.add(x);
	            }
	        }

	        System.out.println("Danh sách chẵn: " + chan);
	        System.out.println("Danh sách lẻ: " + le);

	        // 6. Đảo ngược (không dùng reverse)
	        ArrayList<Integer> daoNguoc = new ArrayList<>();
	        for (int i = list.size() - 1; i >= 0; i--) {
	            daoNguoc.add(list.get(i));
	        }

	        System.out.println("Danh sách đảo ngược: " + daoNguoc);

	        sc.close();

	}

}
