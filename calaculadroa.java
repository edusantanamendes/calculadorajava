import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        num n1 = new num();
        num n2 = new num();
        num res = new num();

        String operacao="SIM";

        while (operacao.equals("SIM") || operacao.equals("sim")){
    
        System.out.println("Digite o primeiro número: ");
        n1.setValor(scan.nextInt());
        System.out.println("Digite o segundo número: ");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getvalor() + n2.getvalor());

        System.out.println("O resultado da soma é: ", n1.getvalor(), (" + "), n2.getvalor()), res.getvalor());

        System.out.println("Deseja realizar outra operação?");

        operacao = scan.next();
        }
    }

}