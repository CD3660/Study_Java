package pack03.fileIO;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		
		File file = new File("IOFolder");
		if(file.exists()) {
			System.out.println("해당 경로 또는 파일이 있음.");
		} else {
			System.out.println("해당 경로 또는 파일이 없음");
			file.mkdir();
		}
	}
}
