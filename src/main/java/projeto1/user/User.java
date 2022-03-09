package projeto1.user;

import org.json.JSONObject;

public abstract class User {

    protected static int idContador = 0;

    protected int id;
    protected String nome;
    protected int idade;

    public User(String nome, int idade) {
        idContador++;
        id = idContador;
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

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }
}
