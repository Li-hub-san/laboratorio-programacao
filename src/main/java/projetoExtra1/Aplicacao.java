package projetoExtra1;

import org.json.JSONObject;
import org.json.JSONPropertyIgnore;
import projetoExtra1.utilizador.Programador;
import projetoExtra1.utilizador.Utilizador;

import java.util.HashMap;
import java.util.List;

public class Aplicacao {

    private final TipoAplicacao tipo;
    private String nome;
    private double preco;
    private final Programador programador;

    private int numeroVendas;
    private boolean publicada;

    private final HashMap<Integer, Avaliacao> mapaAvaliacoes;
    private Double avaliacaoMedia;

    public Aplicacao(TipoAplicacao tipo, String nome, double preco, Programador programador) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.programador = programador;
        this.mapaAvaliacoes = new HashMap<>();
        this.numeroVendas = 0;
    }

    public void adicionarAvaliação(Utilizador utilizador, Avaliacao avaliacao) {
        mapaAvaliacoes.put(utilizador.getId(), avaliacao);
        recalcularAvaliacao();
        programador.recalcularAvaliacao();
    }

    private void recalcularAvaliacao() {
        this.avaliacaoMedia = mapaAvaliacoes.values()
                .stream()
                .mapToDouble(Avaliacao::getClassificacao)
                .average()
                .orElse(0);
    }

    public void adicionarVenda() {
        numeroVendas++;
    }

    public List<Avaliacao> listarAvaliacoes() {
        return mapaAvaliacoes.values().stream().toList();
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
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

    public Double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setPublicada(boolean publicada) {
        this.publicada = publicada;
    }

    @JSONPropertyIgnore
    public boolean isPublicada() {
        return publicada;
    }

    @JSONPropertyIgnore
    public TipoAplicacao getTipo() {
        return tipo;
    }

    @JSONPropertyIgnore
    public int getNumeroVendas() {
        return numeroVendas;
    }

    @JSONPropertyIgnore
    public Programador getProgramador() {
        return programador;
    }

}
