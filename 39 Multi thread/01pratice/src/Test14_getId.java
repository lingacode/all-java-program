class MyThread12 extends Thread{
	public void run() {
		System.out.println("Thread is started name"+getName()+ "Id: "+getId()+"id: "+threadId());
	}
}
public class Test14_getId {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("main start");
		MyThread12 mt1 = new MyThread12();
		MyThread12 mt2 = new MyThread12();
		
		mt1.setName("child1");
		mt2.setName("child1");
		
		System.out.println("mt1 name: "+ mt1.getName());
		System.out.println("mt1 id: "+ mt1.getId());
		System.out.println("mt1 priority: "+ mt1.getPriority());
		
		System.out.println("mt2 name: "+ mt2.getName());
		System.out.println("mt2 id: "+ mt2.getId());
		System.out.println("mt2 priority: "+ mt2.getPriority());
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
		
		
	}

}
