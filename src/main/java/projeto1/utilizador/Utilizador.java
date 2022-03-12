package projeto1.utilizador;

import org.json.JSONObject;
import projeto1.menu.MenuAutenticacao;

public abstract class Utilizador {
    private MenuAutenticacao autenticacao;
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

    public String getPalavraPasse() {
        return palavraPasse;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }
}
