class Test{
    int i1 = 5;
    double d1 = 6.7;
    char ch = 'a';
    long[] la = {8,9};
    String s1 = "Hari";
}
class Test1{
    public static void main(String[] args){
    Test t1 = new Test();
       System.out.println(t1.i1);
       System.out.println(t1.d1);
       System.out.println(t1.ch);
       System.out.println(t1.la[0]);
       System.out.println(t1.la[1]);
       System.out.println(t1.s1);
    }
}

