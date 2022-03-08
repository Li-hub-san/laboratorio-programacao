package projeto1;

import projeto1.user.Cliente;

import java.util.Date;
import java.util.List;

public class Compra {
    private Date date;
    private double preco;
    private List<Aplicacao> aplicacoes;
    private Cliente cliente;

    public Compra(Cliente cliente, List<Aplicacao> aplicacoes) {
        this.cliente = cliente;
        this.aplicacoes = aplicacoes;
        this.date = new Date();
        this.preco = aplicacoes.stream().mapToDouble(Aplicacao::getPreco).sum();
        aplicacoes.forEach(Aplicacao::adicionarVenda);
    }


    // getters and setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }


}
