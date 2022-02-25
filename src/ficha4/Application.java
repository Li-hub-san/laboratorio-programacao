package ficha4;

import ficha4.fruta.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Application {

    static DecimalFormat doubleDigit = new DecimalFormat("0.00");
    static DecimalFormat noDecimal = new DecimalFormat("#0");

    public static void main(String[] args) {

        List<Fruta> frutas = imprimirExercício1();
        Cesto cesto = imprimirExercício2(frutas);
        imprimirExercício3(cesto);

    }

    private static List<Fruta> imprimirExercício1() {
        imprimeTitulo(1);

        imprimeExercicio("Instanciação das frutas");
        FrutaUnidade unidade1 = new FrutaUnidade("bananas", 0.20, 20);
        System.out.println(unidade1);

        FrutaPeso peso1 = new FrutaPeso("laranjas", 0.99, 1.5f);
        System.out.println(peso1);

        FrutaVolume volume1 = new FrutaVolume("tangerinas", 20, 2);
        System.out.println(volume1);

        FrutaVolume volume2 = new FrutaVolume("cerejas", 50, 5);
        System.out.println(volume2);

        imprimeExercicio("Valor das frutas");
        System.out.println(unidade1.getNome() + " - " + paraDuasCasas(unidade1.pagar()));
        System.out.println(peso1.getNome() + " - " + paraDuasCasas(peso1.pagar()));
        System.out.println(volume1.getNome() + " - " + paraDuasCasas(volume1.pagar()));
        System.out.println(volume2.getNome() + " - " + paraDuasCasas(volume2.pagar()));

        return Arrays.asList(unidade1, peso1, volume1, volume2);
    }

    private static Cesto imprimirExercício2(List<Fruta> frutas) {
        imprimeTitulo(2);
        Cesto cesto = new Cesto();

        imprimeExercicio("a) Capacidade total do cesto");
        System.out.println(cesto.getCAP_MAX());

        imprimeExercicio("a) Conteudo do cesto -> frutas");
        System.out.println(cesto.getFrutas());

        imprimeExercicio("b) Inserir itens no cesto");
        System.out.println("Total frutas antes: " + cesto.totalFrutas());
        for (Fruta fruta : frutas) {
            cesto.adicionarFruta(fruta);
        }
        System.out.println("Total frutas depois: " + cesto.totalFrutas());
        System.out.println("Lista do cesto: " + cesto.getFrutas());

        imprimeExercicio("c) Total de itens no cesto");
        System.out.println(cesto.totalFrutas());

        imprimeExercicio("c) Valor total do cesto");
        imprimeValorMonetario(cesto.precoTotalNoCesto());

        imprimeExercicio("d) Numero de frutas do mesmo tipo");
//        System.out.println(cesto.teste(FrutaVolume.class));
        System.out.println("FrutaUnidade: " + cesto.numeroDeFrutasMesmoTipo("FrutaUnidade"));
        System.out.println("FrutaVolume: " + cesto.numeroDeFrutasMesmoTipo("FrutaVolume"));
        System.out.println("FrutaPeso: " + cesto.numeroDeFrutasMesmoTipo("FrutaPeso"));


        imprimeExercicio("e) Valor a pagar em frutas do mesmo tipo");
        System.out.println("FrutaUnidade: " + paraDuasCasas(cesto.valorGastoTipoFruta("FrutaUnidade")));
        System.out.println("FrutaVolume: " + paraDuasCasas(cesto.valorGastoTipoFruta("FrutaVolume")));
        System.out.println("FrutaPeso: " + paraDuasCasas(cesto.valorGastoTipoFruta("FrutaPeso")));

        return cesto;
    }

    public static void imprimirExercício3(Cesto cesto) {

        imprimeTitulo(3);

        imprimeExercicio("Descontos sem lista");

        FrutaPeso fAPeso = new FrutaPeso("Tabaibos", 20, 1.5f);
        FrutaVolume fAVolume = new FrutaVolume("Figos da india", 2, 2);

        System.out.println(fAPeso);
        System.out.println(fAPeso.getNome() + " antes - > " + paraDuasCasas(fAPeso.pagar()));
        fAPeso.setPercentagemDesconto(15);
        System.out.println(fAPeso.getNome() + " desconto " + noDecimal.format(fAPeso.getPercentagemDesconto()) + "% - > " + paraDuasCasas(fAPeso.descontar()));
        System.out.println(fAPeso.getNome() + " depois - > " + paraDuasCasas(fAPeso.pagar()));

        System.out.println(fAVolume);
        System.out.println(fAVolume.getNome() + " antes - > " + paraDuasCasas(fAVolume.pagar()));
        fAVolume.setPercentagemDesconto(20);
        System.out.println(fAVolume.getNome() + " desconto " + noDecimal.format(fAVolume.getPercentagemDesconto()) + "% - > " + paraDuasCasas(fAVolume.descontar()));
        System.out.println(fAVolume.getNome() + " depois - > " + paraDuasCasas(fAVolume.pagar()));

        imprimeExercicio("Descontos através da lista (Cesto)");

        // para conseguir fazer deste modo tive que adicionar o metodo setPercentagemDesconto() à interface -> para ser comum a todas as subclasses da Fruta que implementam o Descontavel.
        cesto.getFrutas().forEach(fruta -> {
            System.out.println("Antes -> " + fruta.getTipo() + " : " + paraDuasCasas(fruta.pagar()));
            if (fruta instanceof FrutaPeso || fruta instanceof FrutaVolume) {
                ((Descontavel) fruta).setPercentagemDesconto(20);
            }
            System.out.println("Depois: " + paraDuasCasas(fruta.pagar()));
        });

    }

    private static void imprimeTitulo(int numeroExercicio) {
        System.out.println("\n****** FICHA 4 -> EXERCÍCIO: " + numeroExercicio + " ******");
    }

    private static void imprimeExercicio(String tituloExercicio) {
        System.out.println("\n-------- " + tituloExercicio + " --------");
    }

    private static String paraDuasCasas(double montante) {
        return doubleDigit.format(montante) + "€";
    }

    private static void imprimeValorMonetario(double montante) {
        System.out.println(doubleDigit.format(montante) + "€");
    }

}
