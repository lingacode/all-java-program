package p2;
import static p1.Sample.*;
import p1.*;


public class Dample{
	public static void main(String[] args){
		System.out.println(a);
		m1();
		
		
		//non-static member
		Sample s = new Sample();
		System.out.println(s.x);
		
		s.m2();
	}
}
		