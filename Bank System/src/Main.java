public class Main {

	public static void main(String[] args) throws InsufficientBalanceException {
		Client lucas = new Client();
		lucas.setName("Lucas");

		Account checkingAccount = new CheckingAccount(lucas);
        checkingAccount.setClient(lucas);
		checkingAccount.setAgency(1234);

		Account savingsAccount = new SavingsAccount(lucas);
		savingsAccount.setClient(lucas);
		savingsAccount.setAgency(1498);
		savingsAccount.deposit(1000);
		savingsAccount.transfer(100, checkingAccount);
		checkingAccount.printExtract();
		savingsAccount.printExtract();

	}

}