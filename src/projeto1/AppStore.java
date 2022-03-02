package projeto1;
import projeto1.user.User;

import java.util.ArrayList;
import java.util.List;

public class AppStore {
    private List<Aplicacao> aplicacoes;
    private List<User> users;

    public AppStore() {
        aplicacoes = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void adicionarUser(User user){
        users.add(user);
    }

    public void adicionarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
    }

    @Override
    public String toString() {
        return "AppStore{" +
                "aplicacoes=" + aplicacoes +
                ", users=" + users +
                '}';
    }

    public void setAplicacoes(List<Aplicacao> aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    public List<User> getUsers() {
        return users;
    }


}
