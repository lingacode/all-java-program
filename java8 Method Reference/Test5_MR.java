interface I1{
	void m1(int p);
}
class A{
	A() {}
	
	A(int p){
		System.out.println("IPC p: "+ p);
	}
	static void abc(int p){
		System.out.println("abc p: "+ p);
	}
	void bbc(int p){
		System.out.println("bbc p: "+ p);
	}
}
class Test5_MR{
	public static void main(String[] args){
		I1 i1 = (p) ->System.out.println(p);   //LE
		i1.m1(5);
		
		I1 i2 = System.out::println;			//Method reference
		i2.m1(6);
//===========================================
		I1 i3 = (p) -> A.abc(p);       //LE just by called class A method
		i3.m1(7);
		
		I1 i4 = A::abc;					//static Method Reference
		i4.m1(8);
//===========================================
		I1 i5  = p -> new A().bbc(p);
		i5.m1(9);

		I1 i6 = new A()::bbc;		//non-static method reference
		i6.m1(10);
//===========================================
		I1 i7 = p -> new A(p);
		i7.m1(11);
		
		I1 i8 = A::new;				//constructor reference
		i8.m1(11);	
		 
		
	}
}












