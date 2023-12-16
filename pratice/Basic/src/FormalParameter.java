
public class FormalParameter {

	public static void main(String[] args) {
		
		m1(10,20);
	}
	public static void m1(final int x, int y) {
//		x = 100;
		y = 200;
		System.out.println(x+"..."+y);
	}

}
