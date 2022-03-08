package ficha3;

public class Casa {
    private String morada;
    private double precoCusto;
    private double precoVenda;

    public Casa() {
    }

    public Casa(String morada) {
        this.morada = morada;
    }

    public double getMargemLucro() {
        return precoVenda - precoCusto;
    }

    public double getPercentMargemLucro() {
        return precoCusto / precoVenda * 100;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "morada='" + morada + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                '}';
    }
}
