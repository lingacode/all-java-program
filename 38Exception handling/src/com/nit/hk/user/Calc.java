 package com.nit.hk.user;
 
 import java.util.Scanner;
 import java.util.InputMismatchException;
 
 import com.nit.hk.blogic.ArrayAddition;
 import com.nit.hk.customexception.ArrayCapacityException;
 import com.nit.hk.customexception.EvenNumberMissingException;
 
 public class Calc{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		try{
			System.out.print("How many values do wish enter? ");
			int numberOfvalues = scn.nextInt();
		
			int[] integers = new int[numberOfvalues];
			for(int i=0; i<numberOfvalues; i++){
				while(true){
					try{
						System.out.print("Enter value"+(i+1)+": ");
						integers[i] = scn.nextInt();
						break;
					}catch(InputMismatchException e){
						System.out.println("Error: Enter only integer");
						scn.nextLine();
					}
				}				
			}
		
			int res = ArrayAddition.addArrayOfIntegers(integers);
			System.out.println("Result: " + res);
			
		}catch(InputMismatchException e){
				System.out.println("Error: Enter only integer");
				scn.nextLine();
		}catch(ArrayCapacityException e){
			System.out.println("Error: "+e.getMessage());			
		}catch(EvenNumberMissingException e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
//java com.nit.hk.user.Calc