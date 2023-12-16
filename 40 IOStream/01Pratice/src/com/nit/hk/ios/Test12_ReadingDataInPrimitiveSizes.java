package com.nit.hk.ios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test12_ReadingDataInPrimitiveSizes {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readLong());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
	}

}
