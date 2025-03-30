public class SavingsAccount extends Account{
    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    void printInfo() {
        System.out.println("extrato da conta poupança");
        super.printInfo();
    }
}