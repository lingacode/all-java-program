import java.sql.SQLOutput;

class MyThread10 extends Thread{
	MyThread10(){
		super();
	}
	MyThread10(String name){
		super(name);
	}
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(getName()+ "run: "+ i);
		}
	}
}
public class Test14_setName {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread10 mt1 = new MyThread10();
		MyThread10 mt2 = new MyThread10("Child2");
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		
		System.out.println("mt2 name: "+mt2.getName());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		mt1.setName("child1");
		
		mt1.setPriority(7);
		mt2.setPriority(9);
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());		
		System.out.println("mt2 name: "+mt2.getName());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
		
	}

}
