class Example1 extends java.lang.Object{
	Example1(final Example1 This){
		super();
	}
	public static void main(String[] args){
		java.lang.System.out.println("main");
	}
	static{
		{
			java.lang.System.out.println("SB1");
		}
		{
			java.lang.System.out.println("SB2");
		}
		{
			java.lang.System.out.println("SB3");
		}
	}
}
