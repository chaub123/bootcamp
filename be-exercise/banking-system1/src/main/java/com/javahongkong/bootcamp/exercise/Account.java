package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface{
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;


	public Account(){};

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	@Override
	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	@Override
	public boolean validatePin(int attemptedPin) {
		// complete the function
		return this.pin == attemptedPin;
	}

	@Override
	public double getBalance() {
		// complete the function
		return this.balance;
	}

	@Override
	public double getPin() {
		// complete the function
		return this.pin;
	}

	@Override
	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	@Override
	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
		this.balance += amount;
	}

	@Override
	public boolean debitAccount(double amount) {
		// complete the function
		if(this.balance < amount) return false;
		this.balance -= amount;
		return true;
	}
}
