interface I1{
	void m1();
	default void m2(){
		System.out.println("default implemented method in I1");
	}
	static void m3(){
		System.out.println("static implemented method in I1");
	}
}
class C implements I1{
	public void m1(){
		System.out.println("abstarct method implemented in class c");
	}
}

class Test10_SM{
	public static void main(String[] args){
		I1 i1 = new C();
		i1.m1();
		i1.m2();
		//i1.m3();
		I1.m3();
		
		C c1 =  new C();
		c1.m1();
		c1.m2();
		//c1.m3();
		//C.m3();
	}
}
		