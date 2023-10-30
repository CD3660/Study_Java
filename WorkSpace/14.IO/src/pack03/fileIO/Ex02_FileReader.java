package pack03.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) throws IOException {
		File file = new File("EX02_FileWriter\\file.txt");
		if(file.exists()) {
			System.out.println("작업 시작");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
		} else {
			System.out.println("파일 없음");
		}
		

	}
}
