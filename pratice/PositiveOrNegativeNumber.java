import java.util.*; 
class PositiveOrNegativeNumber{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);     
        System.out.print("Enter first number: ");  
        int n= sc.nextInt();  
		
		if(n > 0)
			System.out.println("The Number Is Positive");
		else
			System.out.println("The Number Is Negative");
	}
}