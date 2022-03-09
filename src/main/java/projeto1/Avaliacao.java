package projeto1;

import org.json.JSONObject;

public class Avaliacao {

    private final double classificacao;
    private final String comentario;

    // dois construtores porque o comentario é optional
    public Avaliacao(double classificacao, String comentario) {
        this.classificacao = classificacao;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }

    // getters and setter
    public double getClassificacao() {
        return classificacao;
    }

    public String getComentario() {
        return comentario;
    }

}
