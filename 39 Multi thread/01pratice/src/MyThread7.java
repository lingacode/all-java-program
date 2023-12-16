
public class MyThread7 extends Thread{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(getName()+ "Run: "+i);
		}
	}
	public static void main(String[] args) {
		MyThread7 mt7 = new MyThread7();
		mt7.start();
		
		MyThread7 mt8 = new MyThread7();
		mt8.start();
		
		MyThread7 mt9 = new MyThread7();
		mt9.start();		
		
	}

}
