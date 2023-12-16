
public class Testing {
	{
		System.out.println("1111");
	}
	static {
		System.out.println("2222");
	}
	Testing(){
		System.out.println("3333");
	}
	static void myTesting() {
		System.out.println("4444");
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		
	}

}
