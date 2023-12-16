class A{
	static void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
	}
	static void m3(){
		System.out.println("A m3 no-arg");
	}
	int m3(String s){
		System.out.println("A m3 String-arg");
		return 50;
	}
}
class B extends A{
	static void m1(){
		System.out.println("B m1");
	}
	void m2(){
		System.out.println("B m2");
	}
	void m3(float f, int x){
		System.out.println("B m3 float,int arg");
	}
}
class TestAB{
	public static void main(String[] args){
		B b = new B();
		
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
		//b.m3(45.3,67);
		b.m3(45.3f,67);
		
		A a = new B();
		
		a.m1();
		a.m2();
		a.m3();
		a.m3("abc");
		b.m3(45.3f,67);
	}
}