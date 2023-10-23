package pack05.android;

public class Button {//인터페이스를 필드로 두고, 메소드를 통해서 인터페이스의 구현부를 받아온다.
	public OnclickListener listener;
	
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	void click() {
		listener.onClick("View");
	}

}
