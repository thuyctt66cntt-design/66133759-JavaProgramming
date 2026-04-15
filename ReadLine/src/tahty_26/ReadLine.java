package tahty_26;
import java.io.*;
public class ReadLine {

	public static void main(String[] args) throws IOException {
		
		// Tạo một BufferedReader bằng cách System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Nhập chuỗi.");
		System.out.println("Nhập 'stop' kết thúc chương trình.");
		do
		{
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));

	}

}
