class Example{
	static int a = 10;
	static{
		System.out.println("Ex SB1");
	}
	static int b = 20;
	static{
		System.out.println("Ex SB2");
	}
	public static void main(String[] args){
		System.out.println("M M");
	}
	static{
		System.out.println("Ex SB3");
	}
	static int c = 30;
}
class Sample{
	static int d = 50;
	static{
		System.out.println("Sa SB1");
		System.out.println(Example.a);
	}
	public static void main(String[] args){
		System.out.println("Sa main");
		System.out.println(Example.b);
		System.out.println(Example.c);
	}
}