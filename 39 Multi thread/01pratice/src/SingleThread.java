

class SingleThread {
	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		
		long time1,time2;
		
		time1=System.currentTimeMillis();
		pn.print1to50();
		System.out.println("\n");
		pn.print50to1();
		time2=System.currentTimeMillis();
		
		System.out.println("Time Taken: "+(time2-time1)/1000);
	}

}

