interface I1 {
	void m1();
	default void m2(){
		System.out.println("default implemented method in I1");
	}
	static void m3(){
		System.out.println("static implemented method in I1");
	}
}

class C implements I1 {
	public void m1(){
		System.out.println("abstract method implemented in class C");		}
	static void m3(){
		System.out.println("static implemented method in class C");
	}
	void m4() {
		m1();
		m2();
		m3();
		I1.m3();
		//I1.super.m3();
	}
}

class  Test10_SM {
	public static void main(String[] args) {
		I1 i1 = new C();
		i1.m1();
		i1.m2();
		//i1.m3(); //CE: illegal static interface method call
		I1.m3();

		C c1 = new C();
		c1.m1();
		c1.m2();
		//c1.m3(); //CE: c f s method m3() in class C
		//C.m3(); //CE: c f s method m3() in class C
	}
}