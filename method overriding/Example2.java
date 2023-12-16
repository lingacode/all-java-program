class Example2{
	public static void main(String[] args){
		System.out.println("Example main");
	}
}
class Sample extends Example2{
	public static void main(String[] args){
		Example2.main(new String[0]);
		System.out.println("Sample main");
	}
}