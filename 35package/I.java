package p1;
public class I{
	private I(){
		System.out.println("I no-arg constructer");
	}
	public I(String s){
		System.out.println("I String constructer");
	}
	public void m1(){
		System.out.println("I m1");
	}
}