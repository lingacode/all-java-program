package com.nit.hk.ios;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.nit.hk.ios.blogic.FileCopy;
import com.nit.hk.ios.customexception.IOOperationException;

public class Test09_FileCopyBRFRFWDynaCopying {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the srcfile: ");
		String srcFile = scn.nextLine();
		
		System.out.print("Enter the srcfile: ");
		String destFile = scn.nextLine();
		try {
		FileCopy.FileCopy(srcFile, destFile);
		System.out.println("file is copied");
		}catch(IOOperationException e) {
			//String errMessage = e.getMessage();
			//String[] partMessage= errMessage.split(":");
			//System.out.println(partMessage[1]);
			
			Throwable t = e.getCause();
			System.out.println("Error: "+t.getMessage());
		}
		
		
	}
		
}






