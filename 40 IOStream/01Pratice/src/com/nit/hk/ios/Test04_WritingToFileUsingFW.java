package com.nit.hk.ios;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Test04_WritingToFileUsingFW {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileWriter fw = new FileWriter("cbc.txt");
		
		
		fw.write(97);
		fw.write("bcdef");
		fw.flush();
		
		System.out.println("data saved to file");
	}

}
