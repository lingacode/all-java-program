


class MyThread6 extends Thread{
	@Override
	 public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+i);
		}
	}
}
public class Test10 {
	public static void main(String[] args) {
		MyThread6 mt = new MyThread6();
		mt.start();
		mt.start();
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+i);
		}
	}
	

}

