package com.interfaceassignment;
interface Account
{
	void deposit(float amount);
	void withdraw(float amount);
	void calculateinterest();

}
class savingaccount implements Account
{
    float balance;
	@Override
	public void deposit(float amount) {
		balance=amount+balance;
		// TODO Auto-generated method stub
		System.out.println("balance credited:"+amount);
		System.out.println("balance is:"+balance);
	}

	@Override
	public void withdraw(float amount) {
		if((balance-amount)>0)
			balance=balance-amount;
		System.out.println("amount debited:"+amount);
		System.out.println("balance amount:"+balance);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateinterest() {
		// TODO Auto-generated method stub
		
	}


	
}

public class BankDetail {

}
