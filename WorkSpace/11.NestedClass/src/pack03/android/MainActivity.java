package pack03.android;

public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate() {
		super.onCreate();
		Button btn = new Button();
		btn.setListener(new a());
	}
	public static void main(String[] args) {
		MainActivity main = new MainActivity();
		main.onCreate();
	}
}
