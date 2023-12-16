class Bank1{
	public static void main(String[] args) {
		
		//initializing static fields common to all objects of BA class
		BankAccount.bankName			= "HDFC";
		BankAccount.branchName		= "Ameerpet";
		BankAccount.ifsc						= "HD123AM";
		
		//creating new account (opening new account)
		BankAccount1 acc1 = new BankAccount1();	
		BankAccount1 acc2 = new BankAccount1();	

		System.out.println("acc1 object values");
		System.out.println(" acc1.bankName\t\t: "	+ acc1.bankName);
		System.out.println(" acc1.branchName\t: "	+ acc1.branchName);
		System.out.println(" acc1.ifsc\t\t: "				+ acc1.ifsc);
		System.out.println(" acc1.accNum\t\t: "		+ acc1.accNum);
		System.out.println(" acc1.accHName\t\t: "	+ acc1.accHName);
		System.out.println(" acc1.balance\t\t: "		+ acc1.balance);

		System.out.println("\nacc2 object values");
		System.out.println(" acc2.bankName\t\t: "	+ acc2.bankName);
		System.out.println(" acc2.branchName\t: "	+ acc2.branchName);
		System.out.println(" acc2.ifsc\t\t: "				+ acc2.ifsc);
		System.out.println(" acc2.accNum\t\t: "		+ acc2.accNum);
		System.out.println(" acc2.accHName\t\t: "	+ acc2.accHName);
		System.out.println(" acc2.balance\t\t: "		+ acc2.balance);
		
		//initializing non-static fields in acc1 instance with HK object values
		acc1.accNum		= 500045300001L;
		acc1.accHName	= "HK";
		acc1.balance		= 999999;

		//initializing non-static fields in acc2 instance with BK object values
		acc2.accNum		= 500045300002L;
		acc2.accHName	= "BK";
		acc2.balance		= 999999;

		System.out.println("\nacc1 object values");
		System.out.println(" acc1.bankName\t\t: "	+ acc1.bankName);
		System.out.println(" acc1.branchName\t: "	+ acc1.branchName);
		System.out.println(" acc1.ifsc\t\t: "				+ acc1.ifsc);
		System.out.println(" acc1.accNum\t\t: "		+ acc1.accNum);
		System.out.println(" acc1.accHName\t\t: "	+ acc1.accHName);
		System.out.println(" acc1.balance\t\t: "		+ acc1.balance);

		System.out.println("\nacc2 object values");
		System.out.println(" acc2.bankName\t\t: "	+ acc2.bankName);
		System.out.println(" acc2.branchName\t: "	+ acc2.branchName);
		System.out.println(" acc2.ifsc\t\t: "				+ acc2.ifsc);
		System.out.println(" acc2.accNum\t\t: "		+ acc2.accNum);
		System.out.println(" acc2.accHName\t\t: "	+ acc2.accHName);
		System.out.println(" acc2.balance\t\t: "		+ acc2.balance);

		//performing business operation of acc1 and acc2 objects
		System.out.println("\nafter depositing amt from acc1: ");
		acc1.deposit(5);
		System.out.println("  acc1 current balance: ");
		acc1.currentBalance();

		System.out.println("  acc2 current balance: ");
		acc2.currentBalance();

		System.out.println("\nafter withdrawing amt from acc2: ");
		acc2.withdraw(5000);
		System.out.println("  acc2 current balance: ");
		acc2.currentBalance();
		
		System.out.println(" acc1 current balance: ");
		acc1.currentBalance();


	}
}
