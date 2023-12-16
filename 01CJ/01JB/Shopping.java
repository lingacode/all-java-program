class Shopping{
    public static void main(String[] args){

    ShoppingMall s1 = new ShoppingMall();


    s1.company = "NetPlay";
    s1.size = 32;
    s1.price = 1200;
    s1.fit = "skiny";
    s1.payment = "UPI";


    System.out.println("Company\t" + s1.company);
    System.out.println("size\t" + s1.size);
    System.out.println("price \t" + s1.price );
    System.out.println("fit \t" + s1.fit );
    System.out.println("payment\t" + s1.payment);
    }
}