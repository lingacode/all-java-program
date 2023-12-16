class Bank {
	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
	
		
        try{
			acc1.setBalance(-5000);
			
			System.out.println("Current Balance: "+ acc1.getBalance() );

		}catch(IllegalArgumentException e){
			System.out.println("Error: "+ e.getMessage());
		}
	}
}