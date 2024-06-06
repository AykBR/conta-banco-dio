
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite seu nome : ");
            String NomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
            int Numero = scanner.nextInt();


        scanner.nextLine();

       

        System.out.println("Digite sua Agencia : ");
            String Agencia = scanner.nextLine();

        System.out.println("Digite seu saldo : ");
            double Saldo = scanner.nextDouble();

            scanner.close();

        System.out.println("Olá " + NomeCliente +  " Sua conta foi criada com sucesso. Sua conta é " + Numero + " , agencia número: " + Agencia + " e seu saldo é " + Saldo + ", já está disponível para saque.");
    }
    

	}

