package common;

import java.util.Scanner;

import member.MemberDTO;
import product.ProductDTO;

public class Common {
	private Scanner scan;
	private MemberDTO loginInfo;
	private ProductDTO[] items;
	
	public ProductDTO[] getItems() {
		return items;
	}

	public void setItems(ProductDTO[] items) {
		this.items = items;
	}

	public MemberDTO getLoginInfo() {
		return loginInfo;
	}
	
	public void setLoginInfo(MemberDTO loginInfo) {
		this.loginInfo = loginInfo;
	}

	public String getStringScanner(String msg) {
		System.out.println(msg);
		return getStringScanner();
		
	}
	
	public String getStringScanner(int checkValue) {
		while(true) {
			String value = scan.nextLine();
			if(value.length()>=checkValue) {
				return value;
			} else {
				System.out.println(checkValue+"보다 큰 글자 수 입력");
			}
		}
	}	
	
	public String getStringScanner() {
		return scan.nextLine();
	}

	public int getIntScanner(int checkValueMin, int checkValueMax) {
		while (true) {
			int value = getIntScanner();
			if(checkValueMin<=value&&value<=checkValueMax) {
				return value;
			} else {
				System.out.println(checkValueMin+" ~ "+checkValueMax+" 사이 값 입력");
			}
		}
	}
	
	public int getIntScanner(int checkValue) {
		while (true) {
			int value = getIntScanner();
			if(value>checkValue) {
				return value;
			} else {
				System.out.println(checkValue+"보다 큰 값 입력");
			}
		}
	}
	
	public int getIntScanner() {
		while (true) {
			try {
				return Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력");
			}
		}
	}

	public Common() {
		scan = new Scanner(System.in);
	}

	public void endProgram() {
		if (scan != null)
			scan.close();
		scan = null;
	}
}
