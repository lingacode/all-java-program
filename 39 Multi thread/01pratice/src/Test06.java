
class MyThread3 extends Thread{
	@Override
	 public void run() {
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+i);
		}
	}
}
public class Test06 {
	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		mt.run();
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+i);
		}
	}
	

}

