package com.nit.hk.ios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01_ReadingDataUsingFIS {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		
		int data;
		while((data = fis.read())!= -1) {
		System.out.println(data + " "+(char)data);
		}
		
	}
}
