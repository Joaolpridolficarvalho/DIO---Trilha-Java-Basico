import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = terminal.nextInt();

        try {
            count(firstParameter, secondParameter);

        }catch (InvalidParametersException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
        terminal.close();

    }
    static void count(int firstParameter, int secondParameter ) throws InvalidParametersException {
        if (firstParameter > secondParameter)
            throw new InvalidParametersException();

        int counting = secondParameter - firstParameter;
        for (int i = 0; i <= counting; i++)
            System.out.println(i);
    }
}