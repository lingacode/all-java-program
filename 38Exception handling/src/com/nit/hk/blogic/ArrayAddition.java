package com.nit.hk.blogic;

import com.nit.hk.customexception.ArrayCapacityException;
import com.nit.hk.customexception.EvenNumberMissingException;

public class ArrayAddition{
	public static int addArrayOfIntegers(int... integers)
						throws ArrayCapacityException, EvenNumberMissingException{
		if(integers.length<10)
			throw new ArrayCapacityException("pass atleast 10 values");
			
			int evenNumbersCount = 0;
			int evenNumbersSum   = 0;
			
			for(int i=0; i<integers.length; i++){
			
				int value = integers[i];
				
				if(value%2==0){
					evenNumbersSum += value;
					evenNumbersCount++;
				}
			} 
			if(evenNumbersCount<5){
				throw new EvenNumberMissingException(" pass atleast 5 even numbers");
			}
				return evenNumbersSum;
	}
} 
//javac -d bin src\com\nit\hk\blogic\ArrayAddition.java