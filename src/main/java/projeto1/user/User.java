package projeto1.user;

public abstract class User {
    protected int id;
    protected static int num = 0;
    protected String nome;
    protected int idade;

    public User(String nome, int idade) {
        num++;
        id = num;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
