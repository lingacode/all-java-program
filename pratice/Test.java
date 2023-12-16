class Test{
	{
		System.out.println("1111");
	}
	static{
		System.out.println("2222");
	}
	Test(){
		System.out.println("3333");
	}
	static void myTest(){
		System.out.println("4444");
	}
	public static void main(String[] args){
		Test t = new Test();
	}
}
	