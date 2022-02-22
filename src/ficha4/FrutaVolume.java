package ficha4;

public class FrutaVolume extends Fruta{
    private double volume;

    public FrutaVolume(String nome, double preco) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    public double pagar(double volume) {
        return preco * volume;
    }
}
