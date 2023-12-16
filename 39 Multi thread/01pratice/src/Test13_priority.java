class MyThread9 extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+ "run: "+ i);
		}
	}
}
public class Test13_priority {
	public static void main(String[] args) {
		MyThread9 mt1 = new MyThread9();
		MyThread9 mt2 = new MyThread9();
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.setPriority(7);
		mt2.setPriority(9);
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
	}
}
