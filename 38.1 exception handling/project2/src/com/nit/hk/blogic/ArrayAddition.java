package com.nit.hk.blogic;

import com.nit.hk.customexception.*;
import com.nit.hk.customexception.*;

public class ArrayAddition{
	public static int addArrayOfIntegers(int... integers)
						throws ArrayCapacityException, EvenNumberMissingException{
		if(integers.length<10)
			throw new ArrayCapacityException("pass atleast 10 values");
			
			int count = 0;
			int sum   = 0;
			
			for(int i=0; i<integers.length; i++){
			
				int value = integers[i];
				
				if(value%2==0){
					sum += value;
					count++;
				}
			} 
			if(count<5){
				throw new EvenNumberMissingException(" pass atleast 5 even numbers");
			}
				return sum;
	}
} 
