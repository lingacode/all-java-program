class A3{
	static void m1(){
		System.out.println("A m1");
	}
	static void m2(){
		System.out.println("A m2");
		m1();
	}
}
class B extends A3{
	static void m1(){
		System.out.println("B m1");
	}
	void m3(){
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class C extends B{
	static void m2(){
		System.out.println("C m2");
		
	}
}
class D extends C{
	static void m1(){
		System.out.println("D m1");
	}
	static void m2(){
		System.out.println("D m2");
	}
	static void m4(){
		System.out.println("D m4");
	}
	public static void main(String[] args){
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		//d.m4();
	}
}
	