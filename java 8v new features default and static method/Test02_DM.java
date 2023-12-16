interface I1{
	void m1();
	//void m2();
}
interface I2 extends I1{
	void m2();
}
class A implements I1{
	public void m1(){}
}
class A2 extends A implements I2{
	public void m2(){}
}
class B implements I1{
	public void m1(){}
}
class C implements I1{
	public void m1(){}
}