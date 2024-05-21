import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To do: conhecer e importar a classe Scanner;
        //Exibir as mensagens para o usuário;
        //Obter pela classe Scanner os valores digitados no terminal;
        //Exibir a mensagem final

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Legal, agora digite o número de 4 dígitos da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Estamos acabando, qual a agência? ");
        String agencia = scanner.next();

        System.out.println("Por último, qual seu saldo?");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); 
    }
}
