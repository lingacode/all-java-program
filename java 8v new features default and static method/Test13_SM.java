interface I1 {
	void m1();

	default void m2(){System.out.println("default method m2");m9();}
	default void m3(){System.out.println("default method m3");m9();}
	default void m4(){System.out.println("default method m4");m9();}

	static void m5(){System.out.println("static method m5");m8(); }
	static void m6(){System.out.println("static method m6");m8(); }
	static void m7(){System.out.println("static method m7");m8(); }
	
	private static void m8(){ System.out.println("private SM m8\n"); }
	private void m9(){ System.out.println("private NSM m9\n");}
}

class C implements I1{
	public void m1(){ 
		System.out.println("abstract method m1");
	}

	void m10(){
		m1(); 
		m2(); 
		//m5();	//CE: c f s 
		//m8();	//CE: c f s 
		//m9();	//CE: c f s 
		I1.m5();
		//I1.m8(); //CE: m8 has private access
		//I1.m9(); //CE: m9 has private access
	}	
}
class  Test13_PM {
	public static void main(String[] args) {
		I1 i1 = new C();
		i1.m1();

		i1.m2();
		i1.m3();
		i1.m4();

		I1.m5();
		I1.m6();
		I1.m7();

	}
	
}