class A1{
	static int a = 10;
	int x  = 20;
}

class B extends A1{
	public static void main(String[] args){
		System.out.println(a);		
		//System.out.println(x);		
		B b1 = new B();
		System.out.println(b1.x);		
	}
}