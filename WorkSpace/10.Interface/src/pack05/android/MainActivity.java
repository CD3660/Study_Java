package pack05.android;

public class MainActivity {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnclickListener(new OnclickListener() {
			
			@Override
			public void onClick(Object v) {
				System.out.println("나중에 버튼이 클릭 되면 실행할 코드");				
			}
		});
		btn.click();
	}
}
