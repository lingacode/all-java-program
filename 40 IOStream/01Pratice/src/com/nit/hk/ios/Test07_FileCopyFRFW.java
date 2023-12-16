package com.nit.hk.ios;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test07_FileCopyFRFW {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("bbc.txt");
		
		int data;
		while((data = fr.read())!= -1) {
			fw.write(data);
		}
		fw.flush();
		
		fr.close();
		fw.close();
		System.out.println("file is copied");
		
	}

}




