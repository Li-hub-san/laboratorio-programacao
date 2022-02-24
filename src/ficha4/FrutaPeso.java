package ficha4;

public class FrutaPeso extends Fruta {
    private float peso;

    // FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume
    //do tipo float.
    public FrutaPeso(String nome, double preco, float peso) {
        super(nome, preco);
        this.peso = peso;
    }


    @Override
    public double pagar() {
        return preco * peso;
    }

    @Override
    public String toString() {
        return "FrutaPeso{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                "€, peso=" + peso +
                "kg}";
    }

    public double getPeso() {
        return peso;
    }
}
