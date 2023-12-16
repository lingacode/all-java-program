package com.nit.hk.ios;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test08_FileCopyBRFRFW {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		BufferedReader br =new BufferedReader(new FileReader("abc.txt"));
		FileWriter fw = new FileWriter("bbc.txt");
		
		String line;
		while((line = br.readLine())!= null) {
			fw.write(line+ "\n");
		}
		fw.flush();
		
		br.close();
		fw.close();
		System.out.println("file is copied");
		
	}

}




