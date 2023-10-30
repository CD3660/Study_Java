package pack03.fileIO;

import java.io.*;

public class Ex03_ImageIO {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("hos.png");
		FileOutputStream fos = new FileOutputStream("hos2.png");
		int data, count = 0;
		while((data=fis.read())!=-1) {
			count++;
			System.out.println(data);
			fos.write(data);
		}
		System.out.println(count);
		fos.flush();
	}
}
