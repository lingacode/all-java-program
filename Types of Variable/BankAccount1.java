class  BankAccount1 {

		//static fields
		static String bankName;
		static String branchName;
		static String ifsc;

		//non-static fields
		long accNum;
		String accHName;
		double balance;
		
		//business operations methods/Blogic methods
		void deposit(double amt)	{
			balance = balance + amt;
		}

		void withdraw(double amt)	{			
			balance = balance - amt;
		}

		void currentBalance()	{
			System.out.println(balance);
		}

}