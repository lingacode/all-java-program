package com.nit.hk.user;

import java.util.Scanner;

import com.nit.hk.bean.Student;

public class College4 {

	private static String option;

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Student[] sa = new Student[3];
		int index = 0;
		
		String option = "N";
		do {
	    Student s = new Student();	
	    
	    System.out.println("\nEnter Student "+(index+1)+" datails");
		System.out.print("  Enter sno: ");
		s.setSno(scn.nextInt()); scn.nextLine();
		
		System.out.print("  Enter sname: ");
		s.setSname(scn.nextLine());
		
		System.out.print("  Enter course: ");
		s.setCourse(scn.nextLine());
		
		System.out.print("  Enter fee: ");
		s.setFee(scn.nextDouble());

		System.out.println("student object is initialized");
		sa[index] = s;
		index++;
		System.out.println("student object is stored in array");
		
		System.out.println("Do You Want Continue(Y/N)?: ");
		option = scn.next();
		
	 }while(option.equalsIgnoreCase("Y"));
		System.out.println("\nAll Student objects details");
		for(int i = 0; i<=sa.length; i++) {
			System.out.println(sa[i]);
		}
		
		System.out.println("\nExecution is completed");
	}

}
