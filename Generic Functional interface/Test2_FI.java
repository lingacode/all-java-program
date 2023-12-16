//generic interface with two parameters 
interface I2<T , U>{
	void m1(T t , U u);
}
class Test2_FI{
	public static void main(String[] args){
		I2<Integer , String> i2 = (t , u) -> {
			System.out.println(t+" "+u);
		};
		i2.m1(10,"HK");
		
		
	}
}