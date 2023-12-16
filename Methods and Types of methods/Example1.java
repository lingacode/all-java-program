class Example1{
	int x = 10;
	void m1(){
		System.out.println(x);
		x = 20;
	}
		public static void main(String[] args){
			Example1 e1 = new Example1();
				e1.x =15;
				e1.m1();
				System.out.println(e1.x);
		}		
}				