import java.util.*;
class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		if(number % 2 == 0)
			System.out.println("This number is Even");
		else
			System.out.println("This number is odd");
	}
}
	