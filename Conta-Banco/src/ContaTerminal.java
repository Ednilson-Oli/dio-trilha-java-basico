import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Declarando as variaveis 
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

       
        
        System.out.println("Por favor, Digite o número da Conta:");
         numero = scan.nextInt();

        System.out.println("Por favor, Digite o número da Agência:");
        agencia = scan.next();
         
        scan.nextLine();//Limpa o buffer do teclado
        
        System.out.println("Por favor, Digite o Nome do Cliente:");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, Digite o Valor do Saldo:");
        saldo = scan.nextDouble();

        System.out.println(" Olá, " +nomeCliente+
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta "
        +numero+" e seu saldo "+saldo+" ja está disponivel para saque.");

    }
}
