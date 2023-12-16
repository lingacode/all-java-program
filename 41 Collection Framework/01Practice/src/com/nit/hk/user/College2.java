package com.nit.hk.user;

import java.util.Scanner;

import com.nit.hk.bean.Student;

public class College2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many students do you want enter?");
		int numberOfStudents = scn.nextInt();	
		
		Student s1 = null;
		for(int i=1; i<=numberOfStudents; i++) {
	    s1 = new Student();	
	    
	    System.out.println("\nEnter Student "+i+" datails");
		System.out.print("  Enter sno: ");
		s1.setSno(scn.nextInt()); scn.nextLine();
		
		System.out.print("  Enter sname: ");
		s1.setSname(scn.nextLine());
		
		System.out.print("  Enter course: ");
		s1.setCourse(scn.nextLine());
		
		System.out.print("  Enter fee: ");
		s1.setFee(scn.nextDouble());

		System.out.println("student object is stored");
		
	 }
		System.out.println("\nStudent object details");
		System.out.println(s1);
		System.out.println("\nExecution is completed");
	}

}
