package ficha4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Application {

    static DecimalFormat doubleDigit = new DecimalFormat("0.00");

    public static void main(String[] args) {

        List<Fruta> frutas = imprimirExercício1();
        imprimirExercício2(frutas);


    }

    private static List<Fruta> imprimirExercício1() {
        imprimeTitulo(1);

        FrutaUnidade frutaUnidade = new FrutaUnidade("bananas", 0.20, 20);
        System.out.println(frutaUnidade);

        FrutaPeso frutaAoPeso = new FrutaPeso("laranjas", 0.99, 1.5);
        System.out.println(frutaAoPeso);

        FrutaVolume frutaVolume = new FrutaVolume("tangerinas", 20, 2);
        System.out.println(frutaVolume);

        FrutaVolume fruta1 = new FrutaVolume("cerejas", -50, -5);
        System.out.println(fruta1);

        imprimeExercicio("Valor das frutas por tipo");
        imprimeValorMonetario(frutaUnidade.pagar());
        imprimeValorMonetario(frutaAoPeso.pagar());
        imprimeValorMonetario(frutaVolume.pagar());
        imprimeValorMonetario(fruta1.pagar());

        return Arrays.asList(frutaUnidade, frutaAoPeso, frutaVolume, fruta1);
    }

    private static void imprimirExercício2(List<Fruta> frutas) {
        imprimeTitulo(2);

        Cesto cesto = new Cesto();
        for (Fruta fruta : frutas) {
            cesto.adicionarFruta(fruta);
        }

        imprimeExercicio("Capacidade total do cesto");
        System.out.println(cesto.getCapacidadeTotal());

        imprimeExercicio("Total de itens no cesto");
        System.out.println(cesto.totalFrutas());

        imprimeExercicio("Valor total do cesto");
        imprimeValorMonetario(cesto.precoTotalNoCesto());

        imprimeExercicio("Conteudo do cesto -> frutas");
        System.out.println(cesto.getFrutas());

        imprimeExercicio("Numero de frutas do mesmo tipo");
        System.out.println(cesto.teste(FrutaVolume.class));

//        for (Fruta fruta : frutas) {
//            if (fruta instanceof FrutaUnidade) {
//                System.out.println("Fruta à unidade: " + fruta.getQuantidade());
//            }
//
//            if (fruta instanceof FrutaVolume) {
//                System.out.println("Fruta ao volume: " + fruta.getQuantidade());
//            }
//
//            if (fruta instanceof FrutaPeso) {
//                System.out.println("Fruta ao peso: " + fruta.getQuantidade());
//            }
//        }


        System.out.println("Fruta à unidade -> valor a pagar: " + cesto.valorGastoTipoFruta("bananas") + "€");

//        System.out.println("Fruta ao volume -> valor a pagar: " + cesto.valorGastoTipoFruta(frutaVolume) + "€");
//        System.out.println("Fruta ao peso -> valor a pagar: " + cesto.valorGastoTipoFruta(frutaAoPeso) + "€");

        System.out.println("Custo total do cesto: " + cesto.precoTotalNoCesto() + " €");
    }

    private static void imprimeTitulo(int numeroExercicio) {
        System.out.println("\n****** FICHA 4 -> EXERCÍCIO: " + numeroExercicio + " *****\n");
    }

    private static void imprimeExercicio(String tituloExercicio) {
        System.out.println("\n-------- " + tituloExercicio + " --------");
    }

    private static void imprimeValorMonetario(double montante) {
        System.out.println(doubleDigit.format(montante) + "€");
    }

}
