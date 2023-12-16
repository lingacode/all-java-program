class Example5{
	private static int count;
	{
		count++;
	}
	Example5(){
		System.out.println("object is created by NPC");
	}
	Example5(int i){
		System.out.println("object is created by IPC");
	}
	Example5(String s){
		System.out.println("object is created by SPC");
	}
	Example5(double d){
		System.out.println("object is created by DPC");
	}
	public static int getCount(){
		return count;
	}
}

class Test1{
	public static void main(String[] args){
		System.out.println("Number of objects created:" + Example5.getCount());
		
		Example5 e1 = new Example5();
		Example5 e2 = new Example5(5);
		Example5 e3 = new Example5();
		Example5 e4 = new Example5(10.5);
		
		System.out.println("Number of objects created:" + Example5.getCount());
	}
}
		
		
	