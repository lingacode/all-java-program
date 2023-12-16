package com.nit.hk.ios;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.nit.hk.ios.blogic.FileCopy;
import com.nit.hk.ios.customexception.IOOperationException;

public class Test10_FileCopyWithjava {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		//new FileInputStream("abc.txt").transferTo(new FileOutputStream("bbc.txt"));
		//System.out.println("file is copied");
		
			          //or
		//FileReader fr = new FileReader("abc.txt");
		//FileWriter fw = new FileWriter("bbc.txt");
		//fr.transferTo(fw);
		//fw.flush();
		//fr.close();
		//fw.close();
					  //or
		try(
			FileReader fr = new FileReader("abc.txt");
			FileWriter fw = new FileWriter("bbc.txt");
		){
			fr.transferTo(fw);
		}
		System.out.println("file is copied");
		
		
	}
		
}






