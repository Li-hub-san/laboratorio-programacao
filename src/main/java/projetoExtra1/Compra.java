package projetoExtra1;

import org.json.JSONObject;
import projetoExtra1.utilizador.Cliente;

import java.util.Date;
import java.util.List;

public class Compra {

    private final Cliente cliente;
    private final List<Aplicacao> aplicacoes;
    private final Date date;
    private final double preco;

    public Compra(Cliente cliente, List<Aplicacao> aplicacoes) {
        this.cliente = cliente;
        this.aplicacoes = aplicacoes;
        this.date = new Date();

        // calcular preco a partir das aplicações compradas
        this.preco = aplicacoes.stream()
                .mapToDouble(Aplicacao::getPreco)
                .sum();

        // adicionar uma venda a cada uma das aplicações
        aplicacoes.forEach(Aplicacao::adicionarVenda);
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }

    // getters and setters

    public Cliente getCliente() {
        return cliente;
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    public Date getDate() {
        return date;
    }

    public double getPreco() {
        return preco;
    }

}
