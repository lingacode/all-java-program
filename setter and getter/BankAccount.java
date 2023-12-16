class BankAccount{
	String bankName;
	String ifscCode;
	String branchName;
	String accHName;
	long   accNum;
	double balance;
	
	//setter for the field
	void setBankName(String bankName){
		this.bankName = bankName;
	}
	
	void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}
	
	void setBranchName(String branchName){
		this.branchName = branchName;
	}
	
	void setAccHName(String accHName){
		this.accHName = accHName;
	}
	
	void setAccNum(long accNum){
		this.accNum = accNum;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	
	String getbankName(){
		return bankName;
	}
	String getifscCode(){
		return ifscCode;
	}
	String getbranchName(){
		return branchName;
	}
	String getaccHName(){
		return accHName;
	}
	long getaccNum(){
		return accNum;
	}
	double getbalance(){
		return balance;
	}
}


class Bank{
	 public static void main(String[] args){
		 BankAccount acc1  = new BankAccount();
		 
		 acc1.setBankName("HDFC");
		 acc1.setIfscCode("hdfc123456");
		 acc1.setBranchName("Ameerpet");
		 acc1.setAccHName("HK");
		 acc1.setAccNum(500045300001L);
		 acc1.setBalance(2500);
		 
		String bankName = acc1.getbankName();
		String ifscCode = acc1.getifscCode();
		String branchName = acc1.getbranchName();
		String accHName = acc1.getaccHName();
		long   accNum = acc1.getaccNum();
		double balance = acc1.getbalance();
		
		
		System.out.println("bankName \t" + bankName );
		System.out.println("ifscCode \t" + ifscCode );
		System.out.println("branchName \t" + branchName);
		System.out.println("accHName \t " + accHName);
		System.out.println("accNum \t \t" + accNum);
		System.out.println("balance \t " + balance);
	 }
 }
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	