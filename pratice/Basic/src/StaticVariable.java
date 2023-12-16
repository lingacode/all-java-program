
public class StaticVariable {
	//final static varible
	final static int x ;
	//or
	static {
		x= 10;
	}
	static String s ;
	/*
	 * static { s= "Linga"; }
	 */
	 void m1() {
		 int x= 10;
		 s= "Linga";  //not support
	 }
	 StaticVariable(){
		 s= "Linga"; //not support
	 }
	

	public static void main(String[] args) {
		/* s= "Linga"; */
		System.out.println(s);
	}

}
