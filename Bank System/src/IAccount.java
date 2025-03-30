public interface IAccount {
    public void draw (double value) throws InsufficientBalanceException;
    public void deposit(double value);

    void transfer(double value, Account account) throws InsufficientBalanceException;
    void printExtract();
}
