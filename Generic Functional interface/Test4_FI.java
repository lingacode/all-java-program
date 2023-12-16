//generic interface with diff type of Two parameter and return 
interface I4<T, U, R>{
	R m1(T t, U u);
}
class Test4_FI{
	public static void main(String[] args){
		I4<Integer, Integer, String> i4 = (t, u)-> {return t+""+u+""+(t+u);};
		String res = i4.m1(10,20);
		System.out.println(res);
	}
}