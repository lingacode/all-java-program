class A{
	private void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
		m1();
	}
}
class B extends A{
	void m1(){
		System.out.println("B m1");
	}
	public static void main(String[] args){
		B b = new B();
		b.m1();
		b.m2();
		
		A a = new B();
		//a.m1();
		a.m2();
	}
}