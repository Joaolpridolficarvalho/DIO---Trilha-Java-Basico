import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        String name = scanner.nextLine();

        System.out.println("Por favor, digite a Agência !");
        String agency = scanner.nextLine();

        int account = 0;
        boolean validAccount = false;
        while (!validAccount) {
            System.out.println("Por favor, digite o número da conta !");
            try {
                account = Integer.parseInt(scanner.nextLine());
                validAccount = true;
            } catch (NumberFormatException e) {
                System.out.println("Número de conta inválido. Por favor, digite apenas números.");
            }
        }

        float balance = 0;
        boolean validBalance = false;
        while (!validBalance) {
            System.out.println("Por favor, digite o seu saldo");
            try {
                balance = Float.parseFloat(scanner.nextLine());
                validBalance = true;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Por favor, use ponto (.) como separador decimal.");
            }
        }

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account +
                " e seu saldo " + balance + " já está disponível para saque");

        scanner.close();
    }
}