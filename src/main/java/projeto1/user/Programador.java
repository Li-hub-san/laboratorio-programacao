package projeto1.user;

import projeto1.Aplicacao;
import projeto1.TipoAplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programador extends User {
    private float avaliacao;

    // cuidado ao apagar uma aplicacao desta lista tem que ser apagada também da lista de aplicacoes da SppStore
    private List<Aplicacao> aplicacoes;

    public Programador(String nome, int idade) {
        super(nome, idade);
        this.aplicacoes = new ArrayList<>();
    }

    public Aplicacao desenvolverAplicacao(TipoAplicacao tipo, String nome, double preco) {
        return new Aplicacao(tipo, nome, preco, this);
    }

    public void adicionarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
    }

    public void recalcularAvaliacao() {
        List<Float> values = aplicacoes.stream()
                .map(Aplicacao::getAvaliacao)
                .filter(Objects::nonNull) // descartado o que vem a null : sem avaliacao != avaliacao a 0
                .toList();

        float sum = 0;

        for (Float value : values) {
            sum += value;
        }

        avaliacao = sum / values.size();
    }

    public double valorTotalRecebido() {
        double valorTotal = 0;
        for (Aplicacao aplicacao : aplicacoes) {
            int numeroVendas = aplicacao.getNumeroVendas();
            double preco = aplicacao.getPreco();
            valorTotal += numeroVendas * preco;
        }
        return valorTotal;
    }

    // getters and setters
    public float getAvaliacao() {
        return avaliacao;
    }

    public List<Aplicacao> getAplicacoesDesenvolvidas() {
        return aplicacoes;
    }
}
