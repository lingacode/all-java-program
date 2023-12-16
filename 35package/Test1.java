package p2;
import p1.*;
import p3.*;

public class Test1{
	public static void main(String[] args){
		//A1 a1 = new A1();
		//p1.A a = new p1.A();
		//p3.A1 a1 = new p3.A1();
		//C c = new C("abc");
		Class cl = Class.forName("C");
		Constructer con = cl.getDeclaredConstructer(String.class);
		Object obj = con.newInstance();
	}
}