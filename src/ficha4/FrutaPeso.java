package ficha4;

public class FrutaPeso extends Fruta{
    private double peso;

    public FrutaPeso(String nome, double preco) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public double pagar(double peso) {
        return preco * peso;
    }
}
