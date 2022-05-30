package com.masai.day05;
//Que3-02
public class AccountDetails {
	public Account getAccountDetails(int accountId,String accountType,int balance) {
		Account ac = new Account();
		ac.setAccountId(accountId);
		ac.setAccountType(accountType);
		ac.setBalance(balance);
		return ac;
		
	}
	
	public int getWithdrawAmount(int amt) {
		if(amt<=0) {
			System.out.println("Amount should be positive");
		}
		return amt;
	}
	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		Account data =ad.getAccountDetails(101, "Saving", 5000);
		
		System.out.println("Bank Details");
		System.out.println("Account ID:"+data.getAccountId());
		System.out.println("Account Type:"+data.getAccountType());
		System.out.println("Balance:"+data.getBalance());
		System.out.println(data.withdraw(ad.getWithdrawAmount(2000)));
		
	}

}
