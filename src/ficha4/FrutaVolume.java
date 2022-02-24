package ficha4;

public class FrutaVolume extends Fruta implements Descontavel {

    // FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume
    // do tipo float.
    private final float volume;
    private double percentagemDesconto;

    public FrutaVolume(String nome, double preco, float volume) {
        super(TipoFruta.FrutaVolume, nome, preco);
        this.volume = volume;
    }


    @Override
    public double pagar() {
        double precoTotal = preco * volume;
        return precoTotal - precoTotal * (double) percentagemDesconto / 100;
    }

    @Override
    public void descontar(double percentagem) {
        setPercentagemDesconto(percentagem);
    }

    @Override
    public String toString() {
        return "FrutaVolume{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, volume(s)=" + volume +
                "}";
    }

    // getters and setters

    public void setPercentagemDesconto(double percentagemDesconto) {
        this.percentagemDesconto = percentagemDesconto;
    }

    public float getVolume() {
        return volume;
    }


}
