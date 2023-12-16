class Example1{
	void m1(){
		System.out.println("Example1 m1");
	}
	void m2(){
		System.out.println("Example1 m2");
	}
	void m3(){
		System.out.println("Example1 m3");
	}
}
class Sample extends Example1{
	void m1(){
		System.out.println("Sample m1");
	}
	void m2(){
		super.m2();
		System.out.println("Sample m2");
	}
	public static void main(String[] args){
		Sample s = new Sample();
		s.m1();
		s.m2();
		s.m3();
	}
}