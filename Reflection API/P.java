class P{
	private static int x = 10;
	
	private P(){
		System.out.println(" you accessed & execute private constructor");
	}
	private void m1(){
		System.out.println(" you executed private method ");
	}
	public static void main(String[] args){
		System.out.println(x);
	}
	
		
}