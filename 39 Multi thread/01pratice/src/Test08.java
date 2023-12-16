


class MyThread5 extends Thread{
	@Override
	 public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+i);
		}
	}
}
public class Test08 {
	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		mt.start();
		mt.run();
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+i);
		}
	}
	

}

