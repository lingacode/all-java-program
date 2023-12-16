class MyThread11 extends Thread{
	MyThread11(){	
		super();
	}
	MyThread11(String name){
		super(name);
	}
	public void run() {
		System.out.println(getName()+"run start with the priority "+getPriority());
		setName("Hello Thraed");
		setPriority(8);
		System.out.println(getName()+"run start with the priority "+getPriority());
		try{Thread.sleep(5000); }
		catch(InterruptedException e) {}		
		System.out.println(getName()+"run start with the priority "+getPriority());
	}
}
public class Test14_setName_TC {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread11 mt1 =new MyThread11();
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 prior: "+mt1.getPriority());
		
		mt1.setName("child1");
		mt1.setPriority(7);
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 prior: "+mt1.getPriority());
		
		mt1.start();
		try {Thread.sleep(3000);}
		catch(InterruptedException e) {}
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 prior: "+mt1.getPriority());
		
		mt1.setName("Hii Thread");
		mt1.setPriority(9);
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 prior: "+mt1.getPriority());
		
		mt1.setName("HRu?Thread");
		mt1.setPriority(10);
		
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 prior: "+mt1.getPriority());
		
		System.out.println("main end");		
		
	}
}
