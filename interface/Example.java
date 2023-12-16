interface Example{
	int x = 10;
	void m1();
	class A{}
	
	//static{}
	//void m2(){}
	
	default void m3(){}
	static void m4(){}
	public static void main(String[] args){
			System.out.println("main");
	}
	private static void m5(){}
	private void m6(){}
	
	//int y;
	//private int a =10;
	
	int b = 20;
	
	//protected int c = 30;
	
	public int d = 40;
	
	//private void m7();
	
	void m8();
	
	//protected void m9();
	
	public void m10();
}
	class Sample{
			public static void main(String[] args){
					Example e1;
					//e1 = new Example();
			}
		
}
interface P{}

//final interface Q{}

abstract interface R{}

//strictfp interface S{}
//public abstract strictfp interface T{}

interface M{}

interface N extends M{}
interface O extends P,M{}

//interface X implements M{}

//class Y extends M{}
class Z1 implements M{}
class Z2 implements N,M{}

interface Abc{
		void m1();
}

//class Bbc implements Abc{}

class Dbc implements Abc{
		public void m1(){}
};















