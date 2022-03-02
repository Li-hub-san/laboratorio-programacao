package projeto1;

import projeto1.user.Cliente;

import java.util.Date;
import java.util.List;

public class Compra {
    private Date date;
    private double valor;

    public Compra(double valor) {
        this.valor = valor;
        this.date = new Date();
    }


    // getters and setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
