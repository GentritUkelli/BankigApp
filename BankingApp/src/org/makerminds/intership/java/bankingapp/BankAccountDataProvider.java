package org.makerminds.intership.java.bankingapp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDataProvider {
	
	private List<BankAccount> bankAccounts = new ArrayList<>();
	
	public BankAccountDataProvider() {
		
		createBankAccounts();
	}

	private void createBankAccounts() {
		createBankAccount1();
		createBankAccount2();
		createBankAccount3();
		createBankAccount4();
				
	}

	private void createBankAccount1() {
		BankAccountOwner Owner = new BankAccountOwner("Will Smith", "Beverly Hills,41123" ,"will.smith@makerminds.com", "+99888888");
		BankAccount bankAccount = new BankAccount(45566889, Owner);
		bankAccounts.add(bankAccount);
	} 

	private void createBankAccount2() {
		BankAccountOwner Owner = new BankAccountOwner("Jane Doe", "Mansfield Road,55698" ,"jane.doe@makerminds.", "+4455221152");
		BankAccount bankAccount = new BankAccount(45566889, Owner);
		bankAccounts.add(bankAccount);
		
	}
	private void createBankAccount3() {
		BankAccountOwner Owner = new BankAccountOwner("Morgan Freeman", "Highland Street,56458" ,"morgan.freeman@makerminds.", "+456678523");
		BankAccount bankAccount = new BankAccount(45566889, Owner);
		bankAccounts.add(bankAccount);		
	}


	private void createBankAccount4() {
		BankAccountOwner Owner = new BankAccountOwner("Jhon Doe", "Highland Street,55698" ,"jhom,doe@makerminds.com", "+4455221144");
		BankAccount bankAccount = new BankAccount(45566889, Owner);
		bankAccounts.add(bankAccount);		
		
	}
	
	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
}
