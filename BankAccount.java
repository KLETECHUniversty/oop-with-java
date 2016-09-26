package ac.in.kletech;

public class BankAccount {
	 private static final double WithdrawalAmount = 0;
	private static final double DepositAmmount = 0;
	private String sAccName;
	 private int iAcccountNo;
	 private double dbalance;
	  private double dWithdrawalAmount;
private	double dDepositAmmount;


	 
	 
	
	 
	 
	
	public String getsAccName() {
	return sAccName;
}


public int getiAcccountNo() {
	return iAcccountNo;
}


public double getDbalance() {
	return dbalance;
}


public double getdWithdrawalAmount() {
	return dWithdrawalAmount;
}


public double getdDepositAmmount() {
	return dDepositAmmount;
}


	BankAccount(String sAccName,int iAccountNo,double dbalance,double dWithdrawal,double dDeposit, double dDepositAmmount, double dWithdrawalAmount){
		this.sAccName=sAccName;
		this.iAccountNo=iAccountNo;
		this.dbalance=dbalance;	
		this.dWithdrawalAmount=dWithdrawalAmount;
		this.dDepositAmmount=dDepositAmmount;
		
	}
	

	double deposite(){
		return dbalance+DepositAmmount;
		
		
		
	}
	
	double withdrawal(){
		
		return (dbalance-WithdrawalAmount);
		
		
	}
	
	
	void display(){
		
		System.out.println("The balance after deposit is:" +deposite());
		System.out.println("The balance after withdrawal is:" +withdrawal());
		System.out.println("The account holder name is:" +sAccName);
		
		
		
	}
	
	
}
