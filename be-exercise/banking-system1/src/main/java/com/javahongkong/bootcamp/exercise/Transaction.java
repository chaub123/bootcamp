package com.javahongkong.bootcamp.exercise;

public class Transaction implements TransactionInterface {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
		if(bank.getAccount(accountNumber).getPin() != attemptedPin){
			throw new Exception();
		}
	}

	@Override
	public double getBalance() {
		// complete the function
		return bank.getAccount(accountNumber).getBalance();
	}

	@Override
	public void credit(double amount) {
		// complete the function
		bank.getAccount(accountNumber).creditAccount(amount);
	}

	@Override
	public boolean debit(double amount) {
		// complete the function
		return bank.getAccount(accountNumber).debitAccount(amount);
	}
}
