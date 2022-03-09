package projeto1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONPropertyIgnore;
import projeto1.user.Cliente;
import projeto1.user.Programador;
import projeto1.user.Utilizador;

public class AppStore {

    private final List<Aplicacao> aplicacoes;
    private final List<Utilizador> utilizadores;
    private final HashMap<Integer, List<Compra>> mapaCompras;

    public AppStore() {
        aplicacoes = new ArrayList<>();
        utilizadores = new ArrayList<>();
        mapaCompras = new HashMap<>();
    }

    public void registarUser(Utilizador utilizador) {
        utilizadores.add(utilizador);
    }

    public void publicarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
        aplicacao.setPublicada(true);
    }

    // instancia uma nova compra e adiciona a compra à lista de compras da classe Cliente.

    /**
     * Instancia uma nova compra e adiciona-a à lista de compras do Cliente
     *
     * @param cliente Cliente
     * @param aplicacoes Aplicações
     */
    public void comprarAplicacoes(Cliente cliente, List<Aplicacao> aplicacoes) {
        Compra compra = new Compra(cliente, aplicacoes);

        List<Compra> comprasAnteriores = new ArrayList<>();
        if (mapaCompras.containsKey(cliente.getId())) {
            comprasAnteriores = mapaCompras.get(cliente.getId());
        }
        comprasAnteriores.add(compra);

        mapaCompras.put(cliente.getId(), comprasAnteriores);
    }

    public List<Aplicacao> getAplicacoesCompradas(Cliente cliente) {
        return mapaCompras.get(cliente.getId())
            .stream()
            .map(Compra::getAplicacoes)
            .flatMap(Collection::stream)
            .toList();
    }

    public List<Aplicacao> getAplicacoesPorCategoria(TipoAplicacao tipo) {
        return aplicacoes.stream()
            .filter(aplicacao -> aplicacao.getTipo() == tipo)
            .toList();
    }

    // não consigo ter uma igualdade de classificação (tendo em conta que é double)
    // entao vou buscar todas as apps que são de classificação igual ou superior.
    public List<Aplicacao> getAplicacoesPorClassificacao(double classificacaoMinima) {
        return aplicacoes.stream()
            .filter(aplicacao -> aplicacao.getAvaliacaoMedia() >= classificacaoMinima)
            .toList();
    }

    public List<Aplicacao> listarPorNome() {
        // reordena a lista. Necessário devolver a lista.
        aplicacoes.sort(Comparator.comparing(Aplicacao::getNome));
        return aplicacoes;
    }

    public List<Aplicacao> listarPorNumeroVendas() {
        // reordena a lista. Necessário devolver a lista.
        aplicacoes.sort(Comparator.comparing(Aplicacao::getNumeroVendas).reversed());
        return aplicacoes;
    }

    public List<Aplicacao> listarPorClassificacao() {
        // reordena a lista. Necessário devolver a lista.
        aplicacoes.sort(Comparator.comparing(Aplicacao::getAvaliacaoMedia).reversed());
        return aplicacoes;
    }

    public List<Aplicacao> listarAplicacoes(Utilizador utilizador) {
        if (utilizador instanceof Cliente) {
            return mapaCompras.get(utilizador.getId()).stream()
                .map(Compra::getAplicacoes)
                .flatMap(Collection::stream)
                .toList();
        }

        if (utilizador instanceof Programador) {
            return aplicacoes.stream()
                .filter(aplicacao -> aplicacao.getProgramador().getId() == utilizador.getId())
                .toList();
        }

        return null;
    }

    @JSONPropertyIgnore
    public double getValorTotalCompras() {
        List<Cliente> clientes = utilizadores.stream()
            .filter(utilizador -> utilizador instanceof Cliente)
            .map(utilizador -> (Cliente) utilizador)
            .toList();

        List<Compra> compras = new ArrayList<>();
        for (Cliente cliente : clientes) {
            compras.addAll(mapaCompras.get(cliente.getId()));
        }

        double valorCompras = 0;
        for (Compra compra : compras) {
            valorCompras += compra.getPreco();
        }

        return valorCompras;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }

    // getters e setters

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    @JSONPropertyIgnore // esta anotação ignora este getter quando imprime o toString() deste objeto
    public List<Utilizador> getUsers() {
        return utilizadores;
    }

}
