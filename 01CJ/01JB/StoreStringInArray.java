class StoreStringInArray{
    public static void main(String[] args){
      String[] sa = {"lingaraj" , "laxmi" , "reena" , "nrusingha"};
        System.out.println(sa[0]);
	System.out.println(sa[1]);
	System.out.println(sa[2]);
	System.out.println(sa[3]);


     for(int i = 0; i<sa.length; i++){
	System.out.println(sa[i]);
     }

     System.out.println(java.util.Arrays.toString(sa));
    }
}
