package fichaExtra.navio;

import java.util.Date;

public class PortaContentores extends Navio {
    private int max;

    public PortaContentores(String id, String nome, Date anoConstrucao, float comprimento) {
        super(id, nome, anoConstrucao, comprimento);
        this.max = 200;
    }

    // getters and setters
    public int getMaxContentores() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
