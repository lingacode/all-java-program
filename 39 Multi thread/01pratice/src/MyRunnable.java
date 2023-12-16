
public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("run executed");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyRunnable mr = new MyRunnable();
		//mr.start();
		
		Thread th = new Thread(mr);
		th.start();
		
		System.out.println("main end");
		
	}

}
