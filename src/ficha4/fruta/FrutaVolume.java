package ficha4.fruta;

public class FrutaVolume extends Fruta implements Descontavel {

    // FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume
    // do tipo float.
    private final float volume;
    private double percentagemDesconto;

    public FrutaVolume(String nome, double preco, float volume) {
        super(TipoFruta.FrutaVolume, nome, preco);
        this.volume = volume;
    }

    // preço total menos desconto
    @Override
    public double pagar() {
        return preco * volume - descontar();
    }

    // cálculo da percentagem
    @Override
    public double descontar() {
        return (preco * volume) * (double) percentagemDesconto / 100;
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
    public float getVolume() {
        return volume;
    }

    @Override
    public void setPercentagemDesconto(double percentagemDesconto) {
        this.percentagemDesconto = percentagemDesconto;
    }

    @Override
    public double getPercentagemDesconto() {
        return percentagemDesconto;
    }

}
