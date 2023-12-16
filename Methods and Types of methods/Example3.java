class Example3{
	int x = 10;
	void m1(){
		Example3 e1 = new Example3();
			System.out.println(e1.x);
	}
	void m2(){
		System.out.println(x);
	}
}

class Test2{
	public static void main(String[] args){
		Example3 e1  = new Example3();
			e1.x = 15;
			e1.m1();
			e1.m2();
			
		Example3 e2  = new Example3();
			e2.x = 18;
			e2.m1();
			e2.m2();
	}	
}	
			