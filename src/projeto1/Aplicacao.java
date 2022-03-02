package projeto1;

public class Aplicacao {
    private TipoAplicacao tipo;
    private String nome;
    private double preco;
    private double classificacao;

    public Aplicacao(TipoAplicacao tipo, String nome, double preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Aplicacao{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", classificacao=" + classificacao +
                '}';
    }

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

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
