package projeto1.user;

import org.json.JSONObject;

public abstract class Utilizador {

    protected static int idContador = 0;

    protected int id;

    protected String nomeUtilizador;
    protected String palavraPasse;
    protected String nome;
    protected int idade;

    public Utilizador(String nomeUtilizador, String palavraPasse, String nome, int idade) {
        idContador++;
        id = idContador;
        this.nomeUtilizador = nomeUtilizador;
        this.palavraPasse = palavraPasse;
        this.nome = nome;
        this.idade = idade;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }
}
