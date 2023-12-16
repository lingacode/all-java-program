package com.nit.hk.user;

import java.util.Scanner;

import com.nit.hk.bean.Student;

public class College3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How many students do you want enter?");
		int numberOfStudents = scn.nextInt();	
		
		Student[] sa = new Student[numberOfStudents];
		for(int i=1; i<numberOfStudents; i++) {
	    sa[i] = new Student();	
	    
	    System.out.println("\nEnter Student "+(i+1)+" datails");
		System.out.print("  Enter sno: ");
		sa[i].setSno(scn.nextInt()); scn.nextLine();
		
		System.out.print("  Enter sname: ");
		sa[i].setSname(scn.nextLine());
		
		System.out.print("  Enter course: ");
		sa[i].setCourse(scn.nextLine());
		
		System.out.print("  Enter fee: ");
		sa[i].setFee(scn.nextDouble());

		System.out.println("student object is stored");
		
	 }
		System.out.println("\nAll Student objects details");
		for(int i=0; i<sa.length; i++) {
		   System.out.println(sa[i]);
		}
		
		System.out.println("\nExecution is completed");
	}

}
