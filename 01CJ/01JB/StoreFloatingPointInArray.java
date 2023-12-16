class StoreFloatingPointInArray{
    public static void main(String[] args){
       double[] da={10.5,20.4,54.4,56.3,34.1};
          System.out.println(da[0]);
	  System.out.println(da[1]);
	  System.out.println(da[2]);
	  System.out.println(da[3]);
	  System.out.println(da[4]);


      // Forloop
       for(int i=0;i<da.length;i++){
	System.out.println(da[i]);
       }

      System.out.println(java.util.Arrays.toString(da));
    }
}
	