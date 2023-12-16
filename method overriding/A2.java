class A2{
	void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
		m1();
	}
}
class B extends A2{
	void m1(){
		System.out.println("B m1");
	}
	void m3(){
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class C extends B{
	void m2(){
		System.out.println("C m2");
		//m4();
	}
	void m4(){
		System.out.println("c m4");
		//return 10;
	}
}
class D extends C{
	void m1(){
		System.out.println("D m1");
	}
	void m2(){
		System.out.println("D m2");
		m4();
	}
	public static void main(String[] args){
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
	