import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();
          
        System.out.println("Por favor, insira o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, insira a agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero  +" e seu saldo " + saldo + "R$ já está disponível para saque.");
        scanner.close(); 
    }
    
}
