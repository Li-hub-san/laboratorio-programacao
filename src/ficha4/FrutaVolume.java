package ficha4;

public class FrutaVolume extends Fruta {

    private final double volume;

    public FrutaVolume(String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);
        this.volume = quantidade;
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

    @Override
    public double getQuantidade() {
        return volume;
    }
}
