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

        DepositoSaque depositoSaque = new DepositoSaque();
        System.out.println("O que vamos fazer agora? Para depósitos, digite 1; para saques, digite 2.");
        int escolhaUsuario = scanner.nextInt();
        if(escolhaUsuario == 1){
            System.out.println("Digite aqui um valor para depósito:");
            double deposito = scanner.nextDouble();
            scanner.nextLine();
            saldo = depositoSaque.depositarValor(deposito, saldo);
            System.out.println("Legal. O novo valor da sua conta é " + saldo);   
        }
        else if(escolhaUsuario == 2){
            System.out.println("Digite aqui um valor para saque:");
            double saque = scanner.nextDouble();
            scanner.nextLine();
            saldo = depositoSaque.sacarValor(saque, saldo);
            System.out.println("Legal! Você sacou " + saque + " restando na sua conta " + saldo);
        }
        else{
            System.out.println("A opção digitada não é válida.");
        }

        scanner.close(); 
    }
}
