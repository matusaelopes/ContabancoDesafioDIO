import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       


        Scanner leitura = new Scanner(System.in);

        System.out.println("Porfavor, digite o número da agência");
        String agencia= leitura.nextLine();
        System.out.println("Digite o nome do usuário");
        String nomeCliente = leitura.nextLine();
        System.out.println("digite o número da conta");
        int numeroConta = leitura.nextInt();
        System.out.println("Digite seu saldo");
        double saldo = leitura.nextDouble();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é : " + agencia +  ", conta : " + numeroConta +  " e seu saldo : " + saldo +  "já esta disponível");








    }

}
