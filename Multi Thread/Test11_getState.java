class MyThread extends Thread {
	@Override
	public void run(){
		System.out.println("run start");
		System.out.println("After start call in run: "+ this.getState());		

		System.out.println("run paused");
		try{ Thread.sleep(1000); }
		catch(InterruptedException e){ }
		System.out.println("run resumed");
		System.out.println("After start call in run: "+ this.getState());		

		System.out.println("run end");
	}
}

class Test11_getState{
	public static void main(String[] args) throws InterruptedException{

		MyThread mt = new MyThread();
		System.out.println("After mt object creatation in main: "+ mt.getState());

		if(mt.getState().equals(Thread.State.NEW)){
			System.out.println("Hi");
		}else{
				System.out.println("Hello");
		}

		mt.start();
		System.out.println("After start call in main: "+ mt.getState());

		Thread.sleep(1000);
		System.out.println("After start call in main: "+ mt.getState());

		Thread.sleep(1000);
		System.out.println("After start call in main: "+ mt.getState());
	}
};
