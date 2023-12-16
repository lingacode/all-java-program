class A5{
		void m1(Object obj){
			System.out.println("A Object-arg");
		}
};
class B extends A5{
		void m1(String[] args){
			System.out.println("B String-arg");
		}
};
class MOL5_2WithInheritance{
	public static void main(String[] args){
		B b = new B();
		b.m1(50);
		b.m1("a");
		
		System.out.println();
		A5 a = new B();
		a.m1(50);
		a.m1("a");
		
	}
}