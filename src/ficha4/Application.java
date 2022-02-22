package ficha4;

public class Application {

    public static void main(String[] args){

        FrutaUnidade frutaUnidade = new FrutaUnidade("bananas", 0.20);
        System.out.println(frutaUnidade);
        System.out.println(frutaUnidade.pagar(20));

        FrutaPeso frutaAoPeso = new FrutaPeso("laranjas", 0.99);
        System.out.println(frutaAoPeso);
        System.out.println(frutaAoPeso.pagar(1.5));

        FrutaVolume frutaVolume = new FrutaVolume("tangerinas", 20);
        System.out.println(frutaVolume);
        System.out.println(frutaVolume.pagar(2));

        Cesto cesto = new Cesto();
        cesto.adicionarFruta(frutaAoPeso);
        cesto.adicionarFruta(frutaVolume);
        cesto.adicionarFruta(frutaUnidade);

        System.out.println(cesto);
        System.out.println(cesto.totalFrutas());
        System.out.println("Capacidade total " + cesto.getCapicidadeTotal());

    }

}
