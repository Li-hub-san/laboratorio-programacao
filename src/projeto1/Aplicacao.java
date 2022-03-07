package projeto1;

import projeto1.user.Programador;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Aplicacao {

    private TipoAplicacao tipo;
    private String nome;
    private double preco;
    private Float avaliacao;
    private Programador programador;
    private HashMap<Integer, Avaliacao> mapaAvaliacoes;
    private int numeroVendas;

    public Aplicacao(TipoAplicacao tipo, String nome, double preco, Programador programador) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.programador = programador;
        this.mapaAvaliacoes = new HashMap<>();
        this.numeroVendas = 0;
    }

    public void avaliar(int userId, float classificacao) {
        mapaAvaliacoes.put(userId, new Avaliacao(classificacao));
        recalcularAvaliacao();
        programador.recalcularAvaliacao();
    }

    public void avaliar(int userId, float classificacao, String comentario) {
        mapaAvaliacoes.put(userId, new Avaliacao(classificacao, comentario));
        recalcularAvaliacao();
        programador.recalcularAvaliacao();
    }

    private void recalcularAvaliacao() {
        Collection<Avaliacao> values = mapaAvaliacoes.values();

        float sum = 0;

        for (Avaliacao avaliacao : values) {
            sum += avaliacao.getClassificacao();
        }

        avaliacao = sum / mapaAvaliacoes.keySet().size();
    }

    public void adicionarVenda() {
        numeroVendas++;
    }

    public List<Avaliacao> listarAvaliacoes() {
        return mapaAvaliacoes.values().stream().toList();
    }

    @Override
    public String toString() {
        return "Aplicacao{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", classificacao=" + avaliacao +
                '}';
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Float getAvaliacao() {
        return avaliacao;
    }

    public TipoAplicacao getTipo() {
        return tipo;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public Programador getProgramador() {
        return programador;
    }

}
