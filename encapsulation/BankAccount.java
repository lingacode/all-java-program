class BankAccount{
	private double balance;
	public void setBalance(double balance){
		if(balance <= 0)
			throw new IllegalArgumentException("Donot pass -ve Number or zero");
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
}