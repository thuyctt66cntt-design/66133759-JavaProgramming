package tahty_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Khai báo biến đối tượng InputStreamRedear
		InputStreamReader ipReader = new InputStreamReader(System.in);
		//Khai báo biến đối tượng Buffee
		BufferedReader bufReader = new BufferedReader(ipReader);
		// In ra 1 câu hướng dẫn để User biết câng làm gì
		System.out.print("Nhập 1 chuỗi bất kì: ");
		//Đọc dữ liệu từ bàn phím, cất vào biến chuỗi
		String lineDocDuoc = bufReader.readLine();
		//In ra dòng đọc được
		System.out.print(lineDocDuoc);
	}

}
