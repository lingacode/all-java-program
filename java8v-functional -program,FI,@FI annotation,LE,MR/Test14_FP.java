//main type
interface I1{
	void m1();
}

//user class
class Example{
	void m2(I1 i1){
		i1.m1();
	}
}

//1.implementation by using outer class
class C implements I1{
	public void m1(){
		System.out.println("m1 is from class c");
	}
}

class Test14_FP{
	public static void main(String[] args){
		Example e1 = new Example();
		//e1.m2(new I1());
		
		//outer class object
		e1.m2(new C()); //old style upto java 1.0
		
		//2.java 1.1v providing implementation to an interface
		//by using anonymous inner class
		e1.m2(new I1(){
			public void m1(){
				System.out.println("m1 is from AIC");
			}
		});
		
		//3.java 8v Lambda Expression
		e1.m2(()->System.out.println("m1 is from LE"));
	}
}
		
	
