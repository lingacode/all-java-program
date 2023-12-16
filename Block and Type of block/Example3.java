class Example3{
	{
		System.out.println("NSB");
	}
	Example3(){
		System.out.println("NPC");
	}
	Example3(int a){
		System.out.println("IPC");
	}
	Example3(String s){
		System.out.println("SPC");
	}
	public static void main(String[] args){
		System.out.println("main");
		
		Example3 e1;
		e1 = new Example3();
		
		Example3 e2 = new Example3(5);
		Example3 e3 = new Example3("HK");
		
	}
}
		
		
	