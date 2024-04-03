public class Compras implements Comparable<Compras>{

    private String descricaoProduto;
    private double valorProduto;

    public Compras(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Compras: (" +
                "descricao: " + descricaoProduto + '\'' +
                ", valor: " + valorProduto + ')';
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return  Double.valueOf(this.valorProduto)
                .compareTo(Double.valueOf(outraCompra.valorProduto));
    }
}
