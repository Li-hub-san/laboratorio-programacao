package ficha4;

public class FrutaUnidade extends Fruta {
    private final double unidade;

    public FrutaUnidade(String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);
        this.unidade = quantidade;
    }


    @Override
    public double pagar() {
        return preco * unidade;
    }

    @Override
    public String toString() {
        return "FrutaUnidade{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, unidade(s)=" + unidade + "}";
    }
}
