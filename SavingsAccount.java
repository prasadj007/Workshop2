package com.bridgelabz.workshop2;

public class SavingsAccount {

	static double ANNUAL_INTEREST_RATE;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance=savingsBalance;
	}
	
	public double getSavingBalance()
	{
		return this.savingsBalance;
	}
	
	public static void modifyInterestRate(double newInterestRate)
	{
		ANNUAL_INTEREST_RATE=newInterestRate;
	}
	
	public void calculateMonthlyInterest() {
		double monthlyInterest=(savingsBalance*ANNUAL_INTEREST_RATE/12);
		savingsBalance+=monthlyInterest;
	}

}



