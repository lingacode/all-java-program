

class Test09 extends Thread {
	public void run() {
		System.out.println("run");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Thread th = new Thread();
		th.start();
	}
	

}
