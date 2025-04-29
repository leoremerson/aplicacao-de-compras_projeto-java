import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------\nBem-vindo às compras!\n---------------------");

        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();
        scanner.nextLine();

        CartaoCredito cartao = new CartaoCredito(limite);
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Digite a descrição do produto:");
            String produto = scanner.nextLine();

            System.out.println("Digite o valor do produto:");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Compra compra = new Compra(produto, preco);

            if (cartao.adicionarCompra(compra)) {
                System.out.println("Compra realizada!");
                System.out.printf("Saldo atual: R$%.2f\n", cartao.getSaldo());
                System.out.println("\nDigite 0 para encerrar ou 1 para continuar comprando.");
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("\nLimite insuficiente.");
                break;
            }
        }

        cartao.listarCompras();
        scanner.close();
    }
}
