package projeto1;

public class Avaliacao {
    private float classificacao;
    private String comentario;

    // dois construtores porque o comentario é optional
    public Avaliacao(float classificacao, String comentario) {
        this.classificacao = classificacao;
        this.comentario = comentario;
    }

    public Avaliacao(float classificacao) {
        this.classificacao = classificacao;
    }

    // getters and setter
    public float getClassificacao() {
        return classificacao;
    }

}
