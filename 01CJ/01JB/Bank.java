class Bank{
    public static void main(String[] args){
    BankAccount.bankName = "HDFC";
    BankAccount.branchName = "Ameerpet";
    BankAccount.ifsc = "HDFC0001627" ;
    
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    
    acc1.accNum = 1786388331;
    acc1.accHName = "HK";
    acc1.balance = 25000;
   
    acc2.accNum = 1234566778;
    acc2.accHName = "BK";
    acc2.balance = 2500;
   
   System.out.println("\nbankName\t" +acc1.bankName);
   System.out.println("branchName\t" +acc1.branchName);
   System.out.println("ifsc\t\t" +acc1.ifsc);
   System.out.println("accNum\t\t" +acc1.accNum);
   System.out.println("accHName\t" +acc1.accHName); 
   System.out.println("balance\t\t" +acc1.balance);
   
   System.out.println("\nbankName\t" +acc2.bankName);
   System.out.println("branchName\t" +acc2.branchName);
   System.out.println("ifsc\t\t" +acc2.ifsc);
   System.out.println("accNum\t\t" +acc2.accNum);
   System.out.println("accHName\t" +acc2.accHName); 
   System.out.println("balance\t\t" +acc2.balance);

   }
}

    