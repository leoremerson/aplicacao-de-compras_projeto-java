public class Compra implements Comparable<Compra> {
    private String produto;
    private double preco;

    public Compra(String nome, double preco) {
        this.produto = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + ", valor: R$" + String.format("%.2f", preco);
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.preco, outraCompra.getPreco());
    }
}
