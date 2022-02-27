package fichaExtra.navio;

import java.time.LocalDate;

public class Petroleiro extends Navio {
    private float capacidadeCarga;

    public Petroleiro(String nome, LocalDate anoConstrucao, float comprimento, float capacidadeCarga) {
        super(nome, anoConstrucao, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Petroleiro{\n" +
                "  id='" + getId() +
                "',\n  nome='" + nome + '\'' +
                ",\n  anoConstrucao=" + anoConstrucao.getYear() +
                ",\n  comprimento=" + comprimento +
                ",\n  capacidadeCarga=" + capacidadeCarga +
                "\n}";
    }

    // getters and setters
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

}
