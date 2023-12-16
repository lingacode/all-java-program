package com.nit.hk.ios;
import java.io.FileReader;
import java.io.IOException;

public class Test03_ReadingDataUsingFR {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		
		int data;
		while((data = fr.read())!= -1) {
		System.out.println(data + " "+(char)data);
		}
	}

}
