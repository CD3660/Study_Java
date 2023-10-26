package pack03.android;

public class Button {
	public onClickListener listener;
	
	public void setListener(onClickListener listener) {
		this.listener = listener;
		this.click();
	}
	void click() {
		listener.onClick();
	}
	static interface onClickListener {
		void onClick();
	}
}
