package ficha4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cesto {
    private int totalItens;
    private final int capacidadeTotal;
    List<Fruta> frutas;

    public Cesto() {
        this.frutas = new ArrayList<>();
        this.capacidadeTotal = 100;
    }

    public void adicionarFruta(Fruta fruta) {
        if (frutas.size() < capacidadeTotal) {
            frutas.add(fruta);
            totalItens++;
        }
    }

    // c) Um método que calcula o valor total da fruta no cesto. (custo?)
    public int totalFrutas() {
        return totalItens;
    }

    // c) Um método que calcula o valor total da fruta no cesto. (custo)
    public double precoTotalNoCesto() {
        double valorTotal = 0;
        for (Fruta fruta : frutas) {
            valorTotal += (fruta.getPreco() * fruta.getQuantidade());
        }
        return valorTotal;
    }

    // d) 1. Um método que determina o número de frutos de um dado tipo existentes no cesto (através do tipo)
    public double numeroDeFrutasMesmoTipo(Fruta fruta) {
        return fruta.getQuantidade();
    }

    // d) 2. Um método que determina o número de frutos de um dado tipo existentes no cesto (através do nome)
    public double numeroDeFrutasMesmoTipo(String nomeDaFruta) {
        for (Fruta fruta : frutas) {
            if (Objects.equals(fruta.getNome(), nomeDaFruta)) {
                return fruta.getQuantidade();
            }
        }
        return 0;
    }

    // TODO: review.
    public <T extends Fruta> double teste(Class<T> tClass) {
        return frutas.stream()
                .filter(fruta -> fruta.getClass() == tClass)
                .mapToDouble(Fruta::getQuantidade)
                .sum();
    }

    // e) 1. Um método que determina o valor total gasto em frutos de um dado tipo.
    public double valorGastoTipoFruta(Fruta fruta) {
        return fruta.getPreco() * fruta.getQuantidade();
    }

    // e) 2. Um método que determina o valor total gasto em frutos de um dado tipo.
    public double valorGastoTipoFruta(String nomeDaFruta) {
        for (Fruta fruta : frutas) {
            if (Objects.equals(fruta.getNome(), nomeDaFruta)) {
                return fruta.getPreco() * fruta.getQuantidade();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cesto{" +
                "frutas=" + frutas +
                '}';
    }

    // getters and setters
    public List<Fruta> getFrutas() {
        return frutas;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

}
