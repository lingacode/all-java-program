package com.nit.hk.ao.user;

import com.nit.hk.ao.blogic.add.Addition;
import com.nit.hk.ao.blogic.div.Division;
import com.nit.hk.ao.blogic.mul.Multiplicatation;
import com.nit.hk.ao.blogic.sub.Subtraction;

public class Calc{
	public static void main(String[] args){
		Addition.add(10,20);
		Subtraction.sub(10,20);
		Multiplicatation.mul(10,20);
		Division.div(10,20);
	}
}
		