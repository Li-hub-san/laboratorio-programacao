package ficha4;

public class FrutaUnidade extends Fruta{
    private double unidade;
    public FrutaUnidade(String nome, double preco) {
        super(nome, preco);
        this.unidade = unidade;
    }

    @Override
    public double pagar(double unidade) {
        return preco * unidade;
    }

}
