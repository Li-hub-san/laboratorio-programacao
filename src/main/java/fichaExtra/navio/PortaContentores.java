package fichaExtra.navio;

import java.time.LocalDate;

public class PortaContentores extends Navio {
    private int maxContentores;

    public PortaContentores(String nome, LocalDate anoConstrucao, float comprimento, int max) {
        super(nome, anoConstrucao, comprimento);
        this.maxContentores = max;
    }

    // getters and setters
    public int getMaxContentores() {
        return maxContentores;
    }

    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

    @Override
    public String toString() {
        return "PortaContentores{\n" +
                "  id='" + getId() +
                "',\n  nome='" + nome + '\'' +
                ",\n  anoConstrucao=" + anoConstrucao.getYear() +
                ",\n  comprimento=" + comprimento +
                ",\n  max=" + maxContentores +
                "\n}";
    }
}
