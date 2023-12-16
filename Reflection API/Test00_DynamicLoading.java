import java.util.Scanner;
class Test00_DynamicLoading{
	public static void main(String[] args)
	
		throws ClassNotFoundException,InstantiationException,IllegalAccessException{
			
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter class name: ");
		
		String clsName = scn.nextLine();
		
		Class cls  = Class.forName(clsName);
		
		Object obj = cls.newInstance();
		
		System.out.println(obj);
	}
}