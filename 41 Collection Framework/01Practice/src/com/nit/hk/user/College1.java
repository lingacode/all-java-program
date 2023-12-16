package com.nit.hk.user;

import java.util.Scanner;

import com.nit.hk.bean.Student;

public class College1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many students do you want enter?");
		int numberOfStudents = scn.nextInt();	
		
	    Student s1 = new Student();		
		System.out.print("Enter sno: ");
		s1.setSno(scn.nextInt()); scn.nextLine();
		
		System.out.print("Enter sname: ");
		s1.setSname(scn.nextLine());
		
		System.out.print("Enter course: ");
		s1.setCourse(scn.nextLine());
		
		System.out.print("Enter fee: ");
		s1.setFee(scn.nextDouble());

		System.out.println("\ns1 object data");
		System.out.println(s1);
	}

}
