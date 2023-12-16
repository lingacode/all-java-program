class A{}
class B extends A{} 
//class C implements A{}  

interface I1{}
interface I2 extends I1{}				
//interface I3 implements I1{}		

class D implements I1{}		
//class E extends  I1{}

//interface I4  extends A{}				
//interface I5  implements A{}

class P {
	void m1(){  }
}

class Q extends P{   }

interface I6 {
	void m1();
}

interface I7 extends I6{   }

//class R implements I6{    }


//class S implements I6 {
//	void m1(){   }
//}


class T implements I6{	   
	public void m1(){ } 
}

/*
abstract class U{
	abstract void m1();

	void m2(){ }
}

class V   extends    U{  }

class W   extends    U{
		void m1(){ }
}


final class X{  }

class Y extends X{ }

class M{}

final class N extends M{}

class O extends N{ }


class X1{ }
class Y1{ }

class Z1 extends X1, Y1{ }
class Z2 implements I1, I2{ }
class Z3 extends X1 implements I1{  }
class Z4 implements I1 extends X1 {  }
*/