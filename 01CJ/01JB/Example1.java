class Example1{
 //static primitive variable
  static int a =10;
  static int b =20;

 //static reference variable
  static int[] ia1 = {3,4,5};
  static String s1 = "abc";

//non static primitive variable
  int x = 50;
  int y = 60;

 //non static reference variable
   int[] ia2 = {7,8,9};
   String s2 = "bbb";

  public static void main(String[] args){
    System.out.println(a);
    System.out.println(b);
    System.out.println(ia1);
    System.out.println(s1);
    System.out.println();

   // System.out.println(x);
   // System.out.println(y);
   // System.out.println(ia2);
   // System.out.println(s2);
   // System.out.println();

    Example1 e1 = new Example1();
      System.out.println(e1.x);
      System.out.println(e1.y);
      System.out.println(e1.ia2);
      System.out.println(e1.s2);
      System.out.println();

    Example1 e2 = new Example1();
      System.out.println(e2.x);
      System.out.println(e2.y);
      System.out.println(e2.ia2);
      System.out.println(e2.s2);
      System.out.println();
     

    
  }
}
    