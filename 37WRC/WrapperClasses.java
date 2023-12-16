import java.lang.*;
class WrapperClasses{
	public static void main(String[] args){
		//1.pDT =>  WCO convertion
		int i = 10;
		//Integer aObj = new Integer.valueOf(i);
		Integer io2 = Integer.valueOf(i);
		
		System.out.println("i: "+ i);
		//System.out.println("io1: "+io1);
		System.out.println("io2: "+io2);
		
		/*Byte b1 = new Byte(50);
		Byte b2 = new Byte((byte)50);
		System.out.println("b1: "+ b1);
		System.out.println("b2: "+ b2);
		
		Character ch1 = new Character('a');
		Character ch3 = new Character(97);
		Character ch2 = new Character((char)97);
		System.out.println("ch1: "+ ch1);
		System.out.println("ch2: "+ ch2);
		System.out.println("ch3: "+ ch3);
		
		Boolean bo = new Boolean(true);
		Float f1 = new Float(70);
		Float f2 = new Float(32.56f);
		Float f3 = new Float(50.45);
		
		Double d1 = new Double(67.54);
		Double d2 = new Double(98);
		Double d0 = new Double('a');*/
		
		//2. WCO => PDT conversion
		Integer io3  = Integer.valueOf(254);
		/*int x = io3.intvalue();
		byte b = io3.bytevalue();
		short s = io3.shortvalue();
		float f = io3.floatvalue();*/
		
		System.out.println("x: "+io3);
		/*System.out.println("x: "+b);
		System.out.println("x: "+s);
		System.out.println("x: "+f);*/
		
		
		
		
	}
}
		