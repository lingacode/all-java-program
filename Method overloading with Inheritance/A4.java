class A4{
	void m1(float f){
		System.out.println("A float-arg");
	}
};
class B extends A4{
	void m1(int a){
		System.out.println("B int-arg");
	}
	void m1(long l){
		System.out.println("B long-arg");
	}
	void m1(float f){
		System.out.println("B float-arg");
	}
};
class MOL5_2WithInheritance{
	public static void main(String[] args){
		B b = new B();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		
		System.out.println();
		A4 a = new B();
		a.m1(50);
		a.m1('a');
		a.m1(50L);
		
	}
}