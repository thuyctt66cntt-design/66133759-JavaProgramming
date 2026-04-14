package tahty_26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViduDocChuoi {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("baitap.txt");
		//Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		//Khai báo biến đối tượng Buffer
		BufferedReader bufReader = new BufferedReader(ipReader);
		//Đọc 1 dòng dữ liệu từ file, cất vào biến chuỗi
		String line1 = bufReader.readLine();
		//In ra dòng đọc được
		System.out.println(line1);
		String line2 = bufReader.readLine();
		System.out.println(line2);
		String line3 = bufReader.readLine();
		System.out.println(line3);
		
	}

}
