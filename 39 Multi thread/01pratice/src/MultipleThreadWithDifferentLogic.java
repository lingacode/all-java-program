
class MultipleThreadWithDifferentLogic {
	public static void main(String[] args) {
		System.out.println("main start");
		
		AddThread add = new AddThread();
		add.start();
		
		SubThread sub = new SubThread();
		sub.start();
		
		System.out.println("main end");
		
		
	}

}
