package com.nit.hk.customexception;

public class ArrayCapacityException extends Exception{
	public ArrayCapacityException(){
		super();
	}
	public ArrayCapacityException(String errMsg){
		super(errMsg);
	}
} 
