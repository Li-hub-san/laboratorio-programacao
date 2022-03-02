package projeto1.user;

import projeto1.Aplicacao;
import projeto1.TipoAplicacao;

import java.util.ArrayList;
import java.util.List;

public class Programador extends User {
    private float avaliacao;
    // cuidado ao apagar uma aplicacao desta lista tem que ser apagada também da lista de aplicacoes da SppStore
    private List<Aplicacao> aplicacoes;


    public Programador(String nome, int idade) {
        super(nome, idade);
        this.aplicacoes = new ArrayList<>();
    }

    public Aplicacao desenvolverAplicacao(TipoAplicacao tipo, String nome, double preco){
        return new Aplicacao(tipo, nome, preco);

    }

    public void adicionarAplicacao(){
    }

    // getters and setters
    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
}
