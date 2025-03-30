public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Your balance is insufficient");
    }
}
