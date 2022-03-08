package projeto1;

import projeto1.user.Cliente;
import projeto1.user.Programador;
import projeto1.user.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppStore {
    private List<Aplicacao> aplicacoes;
    private List<User> users;

    public AppStore() {
        aplicacoes = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void registarUser(User user) {
        users.add(user);
    }

    public void adicionarAplicacao(Aplicacao aplicacao) {
        aplicacoes.add(aplicacao);
        aplicacao.getProgramador().adicionarAplicacao(aplicacao);
    }

    // instancia uma nova compra e adiciona a compra à lista de compras da classe Cliente.

    /**
     * Instancia uma nova compra e adiciona-a à lista de compras do Cliente
     * @param cliente Cliente
     * @param aplicacoes Aplicações
     */
    public void comprarAplicacoes(Cliente cliente, List<Aplicacao> aplicacoes) {
        Compra compra = new Compra(cliente, aplicacoes);
        cliente.adicionarCompra(compra);
    }

    public List<Aplicacao> getAplicacoesPorCategoria(TipoAplicacao tipo) {
        return aplicacoes.stream()
                .filter(aplicacao -> aplicacao.getTipo() == tipo)
                .toList();
    }

    // não consigo ter uma igualdade de classificação (tendo em conta que é float)
    // entao vou buscar todas as apps que são de classificação igual ou superior.
    public List<Aplicacao> getAplicacoesPorClassificacao(float classificacaoMinima) {
        return aplicacoes.stream()
                .filter(aplicacao -> aplicacao.getAvaliacao() >= classificacaoMinima)
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
        aplicacoes.sort(Comparator.comparing(Aplicacao::getAvaliacao).reversed());
        return aplicacoes;
    }

    public List<Aplicacao> listarAplicacoes(User user) {
        if (user instanceof Cliente) {
            return ((Cliente) user).getAplicacoesCompradas();
        }

        if (user instanceof Programador) {
            return ((Programador) user).getAplicacoesDesenvolvidas();
        }

        return null;
    }

    public double getValorTotalCompras() {
        List<Cliente> clientes = users.stream()
                .filter(user -> user instanceof Cliente)
                .map(user -> (Cliente) user)
                .toList();

        List<Compra> compras = new ArrayList<>();
        for (Cliente cliente : clientes) {
            compras.addAll(cliente.getCompras());
        }

        double valorCompras = 0;
        for (Compra compra : compras) {
            valorCompras += compra.getPreco();
        }

        return valorCompras;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("AppStore{\n  aplicações=[");
        for (Aplicacao aplicacao : aplicacoes) {
            output.append("\n    ").append(aplicacao);
        }
        return output + "\n  ]\n}";
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    public List<User> getUsers() {
        return users;
    }

}
