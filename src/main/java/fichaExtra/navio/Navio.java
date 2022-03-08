package fichaExtra.navio;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Navio {
    private final String id;
    protected String nome;
    protected LocalDate anoConstrucao;
    protected float comprimento;

    public Navio(String nome, LocalDate anoConstrucao, float comprimento) {
        this.id = String.valueOf(UUID.randomUUID());
        this.nome = nome;
        this.anoConstrucao = anoConstrucao;
        this.comprimento = comprimento;
    }

    @Override
    public abstract String toString();

    // getters and setters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAnoConstrucao() {
        return anoConstrucao;
    }

    public float getComprimento() {
        return comprimento;
    }

}
