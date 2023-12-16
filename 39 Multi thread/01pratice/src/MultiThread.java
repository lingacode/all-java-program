
class MultiThread extends Thread{
	static PrintNumbers pn = new PrintNumbers();
	
	@Override
	public void run() {
		pn.print1to50();
	}
	
	public static void main(String[] args) {
		MultiThread mt= new MultiThread();
		
		long time1 = System.currentTimeMillis();
		mt.start();
		pn.print50to1();
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("Time taken: "+ (time2-time1)/1000);
	}

}
