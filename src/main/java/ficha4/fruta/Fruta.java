package ficha4.fruta;

public abstract class Fruta {
    private final TipoFruta tipo;
    protected String nome;
    protected double preco;

    public Fruta(TipoFruta tipo, String nome, double preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double pagar();

    // getters and setters
    public TipoFruta getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
