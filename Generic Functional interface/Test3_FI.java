//generic interface with diff type of one parameter and return type
interface I3<T, R>{
	R m1(T t);
}
class Test3_FI{
	public static void main(String[] args){
		I3<Character , Integer> i3 = (t)->{return (int)t;};
		int res = i1.m1('a');
		System.out.println(res);
	}
}