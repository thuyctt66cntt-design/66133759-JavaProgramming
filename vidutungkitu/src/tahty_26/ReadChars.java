package tahty_26;

import java.io.*;
class ReadChars 
{

	public static void main(String[] args) throws IOException 
	{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap chuoi ki tu, gioi han dau cham.");
		//đọc kia tự
		do
		{
			c = (char) br.read();
			System.out.println(c);
		} while (c !='.');

	}

}
