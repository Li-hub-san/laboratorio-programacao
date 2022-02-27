package fichaExtra.navio;

import java.util.Date;

public class Petroleiro extends Navio {
    private float capacidadeCarga;

    public Petroleiro(String id, String nome, Date anoConstrucao, float comprimento) {
        super(id, nome, anoConstrucao, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    // getters and setters
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
