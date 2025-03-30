public class Account implements IAccount {
    private static final int DEFAULTAGENCY = 1;
    private double balance;
    private int Agency;
    private int number;
    private static int DEFAULTNUMBER = 1;
    private Client client;

    public Account(Client client) {
        this.client = client;
        this.Agency = DEFAULTAGENCY;
        this.number = DEFAULTNUMBER++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return Agency;
    }

    public void setAgency(int agency) {
        Agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void draw(double value) throws InsufficientBalanceException{
        double newBalance = getBalance() - value;
        if (newBalance < 0)
            throw new InsufficientBalanceException();
        setBalance(newBalance);
    }

    @Override
    public void deposit(double value) {
        double newBalance = getBalance() + value;
        setBalance(newBalance);
    }

    @Override
    public void transfer(double value, Account account) throws InsufficientBalanceException {
        draw(value);
        account.deposit(value);
    }

    @Override
    public void printExtract() {

    }

    void printInfo() {
		System.out.println("Titular: " + this.client.getName());
		System.out.printf("Agencia: %d%n", getAgency());
		System.out.printf("Numero: %d%n",getNumber());
		System.out.printf("Saldo: %.2f%n", getBalance());
	}

}


















