package fichaExtra.navio;

import java.util.ArrayList;
import java.util.List;

public class Porto {
    public List<Navio> navios;

    public Porto() {
        this.navios = new ArrayList<>();
    }

    // • Adicionar um novo navio sem permitir a duplicação de Identificador do Navio;
    // UUID Identificador (não será necessario fazer verificação de Identificador).
    public void adiconarNavios(Navio navio) {
        navios.add(navio);
    }

    // • Devolver a quantidade máxima total de contentores de todos os navios porta-contentores atracados no porto;
    public int capacidadeMaximaTotalContentores() {
        int capacidadeTotal = 0;
        for (Navio navio : navios) {
            if (navio instanceof PortaContentores) {
                int capNavio = ((PortaContentores) navio).getMaxContentores();
                capacidadeTotal += capNavio;
            }

        }
        return capacidadeTotal;
    }

    // • Devolver a capacidade total de carga de todos os navios porta-contentores e petroleiros atracados no porto, sabendo que um contentor tem capacidade para 10 toneladas;
    public float capacidadeTotalCarga() {
        int capacidadePortaContentores = capacidadeMaximaTotalContentores();
        float cargaPetroleiros = 0;
        for (Navio navio : navios) {
            if (navio instanceof Petroleiro) {
                float capPetroleiro = ((Petroleiro) navio).getCapacidadeCarga();
                cargaPetroleiros += capPetroleiro;
            }
        }

        return capacidadePortaContentores * 10 + cargaPetroleiros;
    }

    @Override
    public String toString() {
        return "Porto{" +
                "navios=" + navios +
                '}';
    }
}
