class BankAccounts{
	String AccountHolder;
	double balance = 0;
	double deposit;
	double withdraw;
	double overDraftBal = 1000;
	
	String Name(String AccountHolder){
		this.AccountHolder = AccountHolder;
		return AccountHolder;
	}
	
	double depositUser(double deposit) {
		this.deposit = deposit;
		balance = deposit +  balance;
		return balance;
	}
	
	double withdrawUser(double withdraw) {
		this.withdraw = withdraw;
		balance = balance - withdraw;
		return balance;
	}
	
	void printDetails() {
		System.out.println("ACCOUNT HOLDER : " + AccountHolder);
		System.out.println("ACCOUNT BALANCE : $" + balance);
	}
	
	void print() {
		System.out.println();
		System.out.println("ACCOUNT HOLDER : " + AccountHolder);
		System.out.println("ACCOUNT BALANCE : $" + balance);
	}
}

class SavingsAccount extends BankAccounts{
	
	double depositUser(double deposit) {
		this.deposit = deposit;
		balance = deposit +  balance;
		return balance;
	}
	
	double withdrawUser(double withdraw) {
		this.withdraw = withdraw;
		
		
		if(balance < withdraw || balance < 100 || balance ==  0) {
			System.out.println("Can't withdraw, insufficient balance");
		}
		else {
			balance = balance - withdraw;
			return balance;
		}
		
		return withdraw;
	}
	
	void printDetails() {
		System.out.println("\n");
		System.out.println("---------- [ TRANSACTION DETAILS ] ----------");
		super.printDetails();
	}
}

class CheckingAccount extends BankAccounts{
	double depositUser(double deposit) {
		this.deposit = deposit;
		balance = deposit +  balance;
		return balance;
	}
	
	double withdrawUser(double withdraw) {
		this.withdraw = withdraw;
		balance = (balance - withdraw) - 1;
		return balance;
	}
	
	void printDetails2() {
		System.out.println("\n");
		System.out.println("---------- [ TRANSACTION DETAILS ] ----------");
		super.printDetails();
	}
	
	void printDetails() {
		System.out.println("\n");
		System.out.println("---------- [ TRANSACTION DETAILS ] ----------");
		super.printDetails();
		System.out.println("WITHDRAW CHARGE FEE : $1");
		
		System.out.println("The Charge fee is already deducted to your balance. ");
	}
}


class BusinessAccount extends BankAccounts{
	double depositUser(double deposit) {
		this.deposit = deposit;
		balance = deposit +  balance;
		return balance;
	}
	
	double withdrawUser(double withdraw) {
		this.withdraw = withdraw;
		if(withdraw > balance && balance == 0) {
			overDraftBal = overDraftBal - withdraw;
		}
		else if(balance != 0 && withdraw > balance) {
			balance = balance - withdraw;
			
			if(balance == 0 || balance < -1) {
				overDraftBal = overDraftBal - (balance - (balance * 2));
				return balance = 0;
			}
		}
		
		return overDraftBal;
	}
	

	
	void printDetails() {
		System.out.println("\n");
		System.out.println("---------- [ TRANSACTION DETAILS ] ----------");
		super.printDetails();
		System.out.println("OVERDRAFT OUTSTANDING BALANCE : $" + overDraftBal);
		System.out.println("PAYABLE OVERDRAFT : $" + (1000 - overDraftBal) );
		
		//LOANS PAYABLE
		// OUTSTANDING BALANCE
	}
}
