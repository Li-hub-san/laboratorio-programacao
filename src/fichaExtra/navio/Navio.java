package fichaExtra.navio;

import java.util.Date;

public abstract class Navio {
    protected String id;
    protected String nome;
    protected Date anoConstrucao;
    protected float comprimento;

    public Navio(String id, String nome, Date anoConstrucao, float comprimento) {
        this.id = id;
        this.nome = nome;
        this.anoConstrucao = anoConstrucao;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", anoConstrucao=" + anoConstrucao +
                ", comprimento=" + comprimento +
                '}';
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(Date anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
