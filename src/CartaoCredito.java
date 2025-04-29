import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean adicionarCompra(Compra compra) {
        if (compra.getPreco() <= saldo){
            compras.add(compra);
            saldo -= compra.getPreco();
            return true;
        } else {
            return false;
        }
    }

    public void listarCompras() {
        Collections.sort(compras);

        System.out.println("\n-----------------");
        System.out.println("Compra realizada:");
        for (Compra compra : compras) {
            System.out.println(compra);
        }
        System.out.println("-----------------");
        System.out.printf("Saldo do cartão: R$%.2f", saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
