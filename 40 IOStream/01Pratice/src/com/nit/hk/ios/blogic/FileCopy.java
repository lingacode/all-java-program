package com.nit.hk.ios.blogic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.nit.hk.ios.customexception.IOOperationException;

public class FileCopy {
	public static void FileCopy(String srcFile,String destFile) throws IOOperationException {
		try(
				BufferedReader br = new BufferedReader(new FileReader(srcFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
			){
			while(br.ready()) {
				bw.write(br.readLine()+"\n");
			}
		}catch(IOException e) {
			throw new IOOperationException(e); 
		}
	}

}
