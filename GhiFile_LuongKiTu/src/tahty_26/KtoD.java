package tahty_26;
import java.io.*;
public class KtoD {

	public static void main(String[] args) throws IOException{
		String str;
		FileWriter fw;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			fw = new FileWriter("D:\\testUnicode.txt");
		} 
		catch(IOException exc)
		{
			System.out.println("Không mở file được Thúy oi=))."); return;
		}
		System.out.println("Nhap('stop' để kết thúc chương trình).");
		do
		{
			System.out.print(": ");
			str = br.readLine();
			if(str.compareTo("stop") == 0) break;
			str = str + "\r\n";
			fw.write(str);
		}while(str.compareTo("stop") !=0);
		fw.close();

	}

}
