package com.nit.hk.ios;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05_ReadingOneLineAtATimeUsingBR {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line ;
		while((line = br.readLine())!= null) {
		System.out.println(line);
		}
		
	}

}
