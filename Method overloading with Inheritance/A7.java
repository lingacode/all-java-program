class A7{
	int x = m1();
	int m1(){
		System.out.println("A m1");
		return 50;
	}
}
class B extends A7{
	int y = m1();
	int m1(){
		System.out.println("B m1");
		return 60;
	}
}
class TestAB{
	public static void main(String[] args){
		B b = new B();
		
		System.out.println("X: "+ b.x);
		System.out.println("Y: "+ b.y);
	}
}