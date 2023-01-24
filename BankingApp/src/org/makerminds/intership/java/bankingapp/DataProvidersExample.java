package org.makerminds.intership.java.bankingapp;

import java.util.List;

public class DataProvidersExample {

	public static void main(String[] args) {
		
		BankAccountDataProvider bankAccountDataProvider = new BankAccountDataProvider();
		DataProvidersExample dataProvidersExample = new DataProvidersExample();
		dataProvidersExample.displayAllBankAccounts(bankAccountDataProvider.getBankAccounts());

	}

	private void displayAllBankAccounts(List<BankAccount> bankAccounts) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("---------------------------Bank Account List--------------------------").append(System.lineSeparator());
		
		for(BankAccount bankAccount : bankAccounts) {
			BankAccountOwner bankAccountOwner = bankAccount.getBankAccountOwner();
			stringBuilder.append("Bank Account Number: ").append(bankAccount.getAccountNumber()).append(System.lineSeparator());
			stringBuilder.append("Bank Account Owner: ").append(bankAccountOwner.getName()).append(", ").append(bankAccountOwner.getAddress())
				.append(", ").append(bankAccountOwner.getEmail()).append(", ").append(bankAccountOwner.getPhoneNr());
			stringBuilder.append(System.lineSeparator());
			stringBuilder.append("---------------------------------------------------------------------").append(System.lineSeparator());
		}
		System.out.println(stringBuilder);
	}

}
