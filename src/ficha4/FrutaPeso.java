package ficha4;

public class FrutaPeso extends Fruta {
    private final double peso;

    public FrutaPeso(String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);
        this.peso = quantidade;
    }


    @Override
    public double pagar() {
        return preco * peso;
    }

    @Override
    public String toString() {
        return "FrutaPeso{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, peso=" + peso +
                "kg}";
    }

    @Override
    public double getQuantidade() {
        return peso;
    }
}
