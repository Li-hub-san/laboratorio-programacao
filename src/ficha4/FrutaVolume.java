package ficha4;

public class FrutaVolume extends Fruta {

    // FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume
    //do tipo float.
    private float volume;

    public FrutaVolume(String nome, double preco, float volume) {
        super(nome, preco );
        this.volume = volume;
    }


    @Override
    public double pagar() {
        return preco * volume;
    }

    @Override
    public String toString() {
        return "FrutaVolume{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, volume(s)=" + volume +
                "}";
    }

    public double getVolume() {
        return volume;
    }
}
