package com.masai.day05;
// Que3-01
public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	
	
	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		if(balance <=0) {
			System.out.println("Balance should be positive");
		}
		else {
			this.balance = balance;
		}
	}



	public Boolean withdraw(int amt) {
		if(amt <= this.balance) {
			System.out.println("Amount Remainig= "+(this.balance-amt));
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}

}
