import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankAccounts bank = new BankAccounts();
		SavingsAccount sa = new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
		BusinessAccount ba = new BusinessAccount();
		Scanner s = new Scanner(System.in);
		String name;
		int choice;
		int choose;
		double deposit, withdraw;
		
		while(true){
		System.out.println();
		System.out.println("[1] SAVINGS ACCOUNT");
		System.out.println("[2] CHECKING ACCOUNT");
		System.out.println("[3] BUSINESS ACCOUNT");
		System.out.print("Enter your choice : ");
		choice = s.nextInt();
		s.nextLine();
		
		
		accounts : while(true) {
		switch(choice) {
			case 1: 
				System.out.println();
				System.out.print("Enter your Name : ");
				name = s.nextLine();
				sa.Name(name);
				
				System.out.println();
				System.out.println("[1] DEPOSIT ");
				System.out.println("[2] WITHDRAW ");
				System.out.println("[3] CHECK BALANCE");
				System.out.println("[4] LOG OUT");
				System.out.print("Enter your choice : ");
				choose = s.nextInt();
				
						switch(choose) {
						case 1: 
							System.out.print("Enter Amount you want to deposit : $");
							deposit = s.nextDouble();
							sa.depositUser(deposit);
							
							sa.printDetails();
							
							s.nextLine();
							
							break;
						case 2:
							System.out.print("Enter Amount you want to withdraw : $");
							withdraw = s.nextDouble();
							sa.withdrawUser(withdraw);
							sa.printDetails();
							
							s.nextLine();
							
							break;
						
						case 3:
							sa.print();
							s.nextLine();
							break;
							
						case 4:
							break accounts;
							
						}
				break;
				
			case 2:
				System.out.println();
				System.out.print("Enter your Name : ");
				name = s.nextLine();
				ca.Name(name);
				
				System.out.println();
				System.out.println("[1] DEPOSIT ");
				System.out.println("[2] WITHDRAW ");
				System.out.println("[3] CHECK BALANCE");
				System.out.println("[4] LOG OUT");
				System.out.print("Enter your choice : ");
				choose = s.nextInt();
				
						switch(choose) {
						case 1: 
							System.out.print("Enter Amount you want to deposit : $");
							deposit = s.nextDouble();
							ca.depositUser(deposit);
							ca.printDetails2();
							
							s.nextLine();
							
							break;
						case 2:
							System.out.print("Enter Amount you want to withdraw : $");
							withdraw = s.nextDouble();
							ca.withdrawUser(withdraw);
							ca.printDetails();
							
							s.nextLine();
							
							break;
						
						case 3:
							ca.print();
							s.nextLine();
							break;
							
						case 4:
							break accounts;
							
						}
				
				break;
				
			case 3:
				System.out.println();
				System.out.print("Enter your Name : ");
				name = s.nextLine();
				ba.Name(name);
				
				System.out.println();
				System.out.println("[1] DEPOSIT ");
				System.out.println("[2] WITHDRAW ");
				System.out.println("[3] CHECK BALANCE");
				System.out.println("[4] LOG OUT");
				System.out.print("Enter your choice : ");
				choose = s.nextInt();
				
						switch(choose) {
						case 1: 
							System.out.print("Enter Amount you want to deposit : $");
							deposit = s.nextDouble();
							ba.depositUser(deposit);
							
							ba.printDetails();
							
							s.nextLine();
							
							break;
						case 2:
							System.out.print("Enter Amount you want to withdraw : $");
							withdraw = s.nextDouble();
							ba.withdrawUser(withdraw);
							ba.printDetails();
							
							s.nextLine();
							
							break;
						
						case 3:
							ba.print();
							s.nextLine();
							break;
							
						case 4:
							break accounts;
							
						}
				break;
			}
		}

	}
				
		
		
		
	}
}
