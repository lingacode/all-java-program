class Example{
	void add(int a ,int b){
		System.out.println("Example add(int,int):"+(a+b));
	}
	void sub(int a, int b){
		System.out.println("Example sub(int,int):"+(a-b));
	}
}
class Sample extends Example{
	void add(int a,int b){
		System.out.println("add(int,int)in Sample");
		System.out.println("The addition of"+a+"and"+b+"is"+(a+b));
	}
	public static void main(String[] args){
		Sample s =  new Sample();
		s.add(10,20);
		s.sub(10,20);
	}
}
		