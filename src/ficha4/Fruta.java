package ficha4;

public abstract class Fruta {
    protected String nome;
    protected double preco;
    protected double unidadeMedida;

    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double pagar(double unidadeMedida);

    // getters and setters
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

    public double getUnidadeMedida() {
        return unidadeMedida;
    }


    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", unidadeMedida=" + unidadeMedida +
                '}';
    }
}
