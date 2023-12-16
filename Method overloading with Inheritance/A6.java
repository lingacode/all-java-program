class A6{
	void m1(String[] args){
		System.out.println("A String-arg");
	}		
};
class B extends A6{
	void m1(Object obj){
		System.out.println("B Object-arg");
	}
		
};
class MOL5_2WithInheritance{
	public static void main(String[] args){
		B b = new B();
		b.m1(50);
		b.m1("a");
		
		System.out.println();
		A6 a = new B();
		a.m1(50);
		a.m1("a");
		
	}
}