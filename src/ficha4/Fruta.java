package ficha4;

public abstract class Fruta {
    protected String nome;
    protected double preco;
    protected double quantidade;

    public Fruta(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public abstract double pagar();

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

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
