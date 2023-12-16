package com.nit.hk.ios;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_WritingDataToFileUsingFOS {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		
		fos.write(97);
		String s = "bcdef";
		fos.write(s.getBytes());
		System.out.println("data saved in a file");
	}

}
