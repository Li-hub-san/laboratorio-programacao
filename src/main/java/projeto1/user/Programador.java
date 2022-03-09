package projeto1.user;

import org.json.JSONPropertyIgnore;
import projeto1.Aplicacao;
import projeto1.TipoAplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programador extends Utilizador {

    private double avaliacaoMedia;
    private final List<Aplicacao> aplicacoesDesenvolvidas;

    public Programador(String nomeUtilizador, String palavraPasse, String nome, int idade) {
        super(nomeUtilizador, palavraPasse, nome, idade);
        this.aplicacoesDesenvolvidas = new ArrayList<>();
    }

    public Aplicacao desenvolverAplicacao(TipoAplicacao tipo, String nome, double preco) {
        Aplicacao aplicacao = new Aplicacao(tipo, nome, preco, this);
        aplicacoesDesenvolvidas.add(aplicacao);
        return aplicacao;
    }

    public void recalcularAvaliacao() {
        List<Double> classificacoes = aplicacoesDesenvolvidas.stream()
                .filter(Aplicacao::isPublicada)
                .map(Aplicacao::getAvaliacaoMedia)
                .filter(Objects::nonNull) // descartado o que vem a null : sem avaliacao != avaliacao a 0
                .toList();

        double sum = 0;

        for (Double classificacao : classificacoes) {
            sum += classificacao;
        }

        avaliacaoMedia = sum / classificacoes.size();
    }

    public double valorTotalRecebido() {
        double valorTotal = 0;

        for (Aplicacao aplicacao : aplicacoesDesenvolvidas) {
            int numeroVendas = aplicacao.getNumeroVendas();
            double preco = aplicacao.getPreco();
            valorTotal += numeroVendas * preco;
        }

        return valorTotal;
    }

    // getters and setters

    @JSONPropertyIgnore
    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    @JSONPropertyIgnore
    public List<Aplicacao> getAplicacoesDesenvolvidas() {
        return aplicacoesDesenvolvidas;
    }

}
