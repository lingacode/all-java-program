abstract class Example{
	abstract void m1();
	
	static int a = m2();
	
	static int m2(){
		System.out.println("Ex class sv");
		return 50;
	}
	static{
		System.out.println("Ex class SB");
	}
	static void m3(){
		System.out.println("Ex class SM");
	}
	public static void main(String[] args){
		System.out.println("EX class MM");
		System.out.println(a);
		m3();
	}
	int x = m4();
	int m4(){
		System.out.println("Ex class NSM");
		return 60;
	}
	{
		System.out.println("Ex class NSB");
	}
	Example(){
		System.out.println("Ex class NPC");
	}
	void m5(){
		System.out.println("Ex class NSM");
	}
}

class Sample extends Example{
	void m1(){
		System.out.println("m1 is executed from sample");
	}
}



























