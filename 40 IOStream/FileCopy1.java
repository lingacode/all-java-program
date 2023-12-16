import java.io.*;
import java.util.*;

class FileCopy1{
	public static void main(String[] args)
					throws FileNotFoundException,IOException{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the src file: ");
		String srcFile = scn.nextLine();
		
		
		System.out.print("Enter the dest file: ");
		String destFile = scn.nextLine();
		
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);		
		
		int data;
		while((data=fis.read())!= -1){
			fos.write(data);
		}
		fis.close();
		fos.close();
		System.out.println("file is copied");
	}
	
}
				
			
		
		