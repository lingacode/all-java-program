class A1{
	void m1(float f){
		System.out.println("A float-arg");
	}
};
class B extends A1{
	void m1(int a){
		System.out.println("B int-arg");
	}
};
class MOL6WithInheritance{
	public static void main(String[] args){
		B b = new B();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		
		System.out.println();
		A1 a = new B();
		a.m1(50);
		a.m1('a');
		a.m1(50L);
		
	}
}