
class SubThread extends Thread{
	int sub =0;
	public void run() {
		for(int i=50; i>=0; i--) {
			sub -= i;
		System.out.println("The Subtraction: "+ sub);
		}
	}

}
