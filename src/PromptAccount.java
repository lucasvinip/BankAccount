import java.util.Locale;
import java.util.Scanner;

public class PromptAccount {
    public static void main(String[] args) throws Exception {
        int numberAgency;
        String nameClient;
        String agency = "067-8";
        double balance = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é seu nome? ");
        nameClient = scanner.next();

        System.out.println("Digite o numero da Agência !");
        numberAgency = scanner.nextInt();

        System.out.println("Olá " + nameClient +", obrigado por criar uma conta em nosso banco, sua agência é " + agency +", conta " + numberAgency + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
