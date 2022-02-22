package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
    private int totalItens;
    private final int capicidadeTotal = 100;
    List<Fruta> frutas;

    public Cesto() {
        this.frutas = new ArrayList<>();
    }

    public void adicionarFruta(Fruta fruta){
        if (frutas.size() < capicidadeTotal){
            frutas.add(fruta);
            totalItens++;
        }
    }

    public int totalFrutas(){
        return totalItens;
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

    public int getCapicidadeTotal() {
        return capicidadeTotal;
    }

}
