public class CheckingAccount extends Account {
    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    void printInfo() {
        System.out.println("extrato da conta corrente");
        super.printInfo();
    }
}
