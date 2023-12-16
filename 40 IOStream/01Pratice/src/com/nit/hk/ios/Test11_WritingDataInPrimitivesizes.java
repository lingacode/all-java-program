package com.nit.hk.ios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test11_WritingDataInPrimitivesizes {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("abc.txt"));
		dos.writeLong(97);
		dos.writeInt(200);
		dos.writeChar('a');
		dos.writeBoolean(true);
		System.out.println("data is saved");
	}

}
