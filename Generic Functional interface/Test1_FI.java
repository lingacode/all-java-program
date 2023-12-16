interface I1<T>{
	T m1(T t);
}
class Test1_FI{
	public static void main(String[] args){
		I1<Integer> i1 = (t) -> {return t+20;};
		int res = i1.m1(10);
		System.out.println(res);
	}
}
	