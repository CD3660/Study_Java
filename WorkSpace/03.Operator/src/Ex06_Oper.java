
public class Ex06_Oper {
	public static void main(String[] args) {
		boolean bool1 = 1<3;
		boolean bool2 = 1>3;
		boolean bool3 = 1<=3;
		boolean bool4 = 1>=3;
		boolean bool5 = 1==3;
		boolean bool6 = 1!=3;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		System.out.println(bool5);
		System.out.println(bool6);
		
		
		boolean bool7 = 1<3 && 1<4;
		boolean bool8 = 1<3 || 1>4;
		System.out.println(bool7);
		System.out.println(bool8);
	}
}
