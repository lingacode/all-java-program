class Example4{
	    int x = 10;
		void m1(int p){
			p = 50;
		}
		void m2(Example4 e){
			e = new Example4();
		}
		void m3(Example4 e){
			e.x = 15;
		}
		void m4(Example4 e){
			e = new Example4();
			e.x = 16;
		}
		void m5(Example4 e){
			e.x = 19;
			e = new Example4();
			e.x = 20;
		}
}

class Test3{
	public static void main(String[] args){
		Example4 e1 = new Example4();
		int q = 18;
		System.out.println("b m c q"+ q);
		
		e1.m1(q);
		System.out.println("a m c q"+ q);
		
		Example4 e2 = new Example4();
		System.out.println("b m c e2"+ e2);
		
		e1.m2(e2);
		System.out.println("a m c e2"+ e2);
		
		System.out.println("b m c e2"+ e2);
		System.out.println("b m c e2.x"+ e2.x);
		
		e1.m3(e2);
		System.out.println("a m c e2.x"+ e2.x);
		System.out.println("a m c e2"+ e2);
		
		System.out.println("b m c e2.x"+ e2.x);
		
		e1.m4(e2);
		System.out.println("a m c e2.x"+ e2.x);
		
		System.out.println("b m c e2.x"+ e2.x);
		e1.m5(e2);
		System.out.println("a m c e2.x"+ e2.x);
		
	}
}
		
		
			
		