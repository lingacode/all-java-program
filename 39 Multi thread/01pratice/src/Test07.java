
class MyThread4 extends Thread{
	@Override
	 public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+i);
		}
	}
}
public class Test07 {
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		mt.run();
		mt.start();
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+i);
		}
	}
	

}

