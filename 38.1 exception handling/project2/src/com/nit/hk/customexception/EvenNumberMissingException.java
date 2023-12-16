package com.nit.hk.customexception;

public class EvenNumberMissingException extends Exception{
	public EvenNumberMissingException(){
		super();
	}
	public EvenNumberMissingException(String errMsg){
		super(errMsg);
	}
}
