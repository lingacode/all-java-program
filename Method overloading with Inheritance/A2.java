class A2{
	void m1(int a){
		System.out.println("A int-arg");
	}
};
class B extends A2{
	void m1(float f){
		System.out.println("B float-arg");
	}
	void m1(char ch){
		System.out.println("B char-arg");
	}
};
class MOL5_1WithInheritance{
	public static void main(String[] args){
		B b = new B();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		
		System.out.println();
		A2 a = new B();
		a.m1(50);
		a.m1('a');
		//a.m1(50L);
		
	}
}