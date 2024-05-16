import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bom Dia ! no que podería ajudar ? ");
        System.out.println("----------------------------------------------------------------");

        System.out.println("1. Saldo ");
        System.out.println("2. meus emprestimos  ");
        System.out.println("3. cartão de credito  ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 :
                verificarSaldo();
                break;
            case 2 :
                verificarEmprestimo();
                break;
            case 3 :
                verificarCartaoDeCredito();
                break;

            default:
                System.out.println("Opção invalida !!");
        }
        scanner.close();

    }
    public static void verificarSaldo (){
        System.out.println("R$ 1000,23");
    }

    public static void verificarEmprestimo (){
        System.out.println("Sua divida está de R$ 6580,50");
    }

    public static void verificarCartaoDeCredito(){
        System.out.println("Seu Cartão está cancelado !!");
    }

}