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
            valorTotal += fruta.pagar();
        }
        return valorTotal;
    }

    // d) 2. Um método que determina o número de frutos de um dado tipo existentes no cesto (através do nome)
    public double numeroDeFrutasMesmoTipo(String tipoFruta) {
        double quantidade = 0;
        for (Fruta fruta : frutas) {
            if (Objects.equals(fruta.getClass().getSimpleName(), tipoFruta)) {
                if (fruta instanceof FrutaUnidade) {
                    quantidade += ((FrutaUnidade) fruta).getQuantidade();
                }

                if (fruta instanceof FrutaVolume) {
                    quantidade += ((FrutaVolume) fruta).getVolume();
                }

                if (fruta instanceof FrutaPeso) {
                    quantidade += ((FrutaPeso) fruta).getPeso();
                }
            }
        }
        return quantidade;
    }

    // e) 2. Um método que determina o valor total gasto em frutos de um dado tipo.
    public double valorGastoTipoFruta(String tipoFruta) {
        double valorTotal = 0;
        for (Fruta fruta : frutas) {
            if (Objects.equals(fruta.getTipo().name(), tipoFruta)) {
                valorTotal += fruta.pagar();
            }
        }
        return valorTotal;
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
