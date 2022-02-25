package ficha4;

public class FrutaPeso extends Fruta implements Descontavel {
    private final float peso;
    private double percentagemDesconto;

    // FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume
    //do tipo float.
    public FrutaPeso(String nome, double preco, float peso) {
        super(TipoFruta.FrutaPeso, nome, preco);
        this.peso = peso;
    }


    @Override
    public double pagar() {
        return preco * peso - descontar();
    }

    @Override
    public String toString() {
        return "FrutaPeso{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, peso=" + peso +
                "kg}";
    }

    public float getPeso() {
        return peso;
    }

    public void setPercentagemDesconto(double percentagemDesconto) {
        this.percentagemDesconto = percentagemDesconto;
    }

    @Override
    public double descontar() {
        return (preco * peso) * (double) percentagemDesconto / 100;
    }
}
