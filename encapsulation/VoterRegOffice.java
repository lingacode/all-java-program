import java.util.Scanner;
import java.util.InputMismatchException;
class VoterRegOffice{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		while(true){
			Voter v = new Voter();
			System.out.println("\n Enter Name: ");
			v.setName(scn.nextLine());
			try{
				System.out.println("Enter Age:");
				v.setAge(scn.nextInt());
				
				System.out.println("Hi "+v.getName() + " your details are saved ");			
				System.out.println("Please collect your voter card ");
				System.out.println("from eseva after 30 days");	
			}catch(InputMismatchException e){
				System.out.println("pass By Integer: ");
				scn.nextLine();
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
	}
}