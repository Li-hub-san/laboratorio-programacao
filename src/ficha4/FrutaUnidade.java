package ficha4;

public class FrutaUnidade extends Fruta {

    private int quantidade;

    // Nota: a classe FrutaUnidade terá uma variável quantidade do tipo int
    public FrutaUnidade(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }


    @Override
    public double pagar() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "FrutaUnidade{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, unidade(s)=" + quantidade + "}";
    }

    // getters and setters

    public int getQuantidade() {
        return quantidade;
    }

}
