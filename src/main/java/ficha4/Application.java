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

        FrutaVolume volume2 = new FrutaVolume("tabaibos", 20, 5);
        System.out.println(volume2);

        imprimeExercicio("Valor das frutas");

        System.out.println(unidade1.getNome() + " - " + montanteParaDuasCasas(unidade1.pagar()));
        System.out.println(peso1.getNome() + " - " + montanteParaDuasCasas(peso1.pagar()));
        System.out.println(volume1.getNome() + " - " + montanteParaDuasCasas(volume1.pagar()));
        System.out.println(volume2.getNome() + " - " + montanteParaDuasCasas(volume2.pagar()));

        imprimeExercicio("Quantidade");

        System.out.println(unidade1.getNome() + " - " + paraUnidades(unidade1.getQuantidade()));
        System.out.println(volume1.getNome() + " - " + paraVolume(volume1.getVolume()));
        System.out.println(volume2.getNome() + " - " + paraVolume(volume2.getVolume()));
        System.out.println(peso1.getNome() + " - " + paraKg(peso1.getPeso()));


        return Arrays.asList(unidade1, peso1, volume1, volume2);
    }

    private static Cesto imprimirExercício2(List<Fruta> frutas) {
        imprimeTitulo(2);
        Cesto cesto = new Cesto();

        imprimeExercicio("a) Capacidade total do cesto");
        System.out.println(cesto.getCapacidadeMaxima());

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
        System.out.println(montanteParaDuasCasas(cesto.precoTotalNoCesto()));

        imprimeExercicio("d) Quantidade de frutas por tipo");
        System.out.println("FrutaUnidade: " + paraUnidades(cesto.quantidadeDeFrutasMesmoTipo("FrutaUnidade")));
        System.out.println("FrutaVolume: " + paraVolume(cesto.quantidadeDeFrutasMesmoTipo("FrutaVolume")));
        System.out.println("FrutaPeso: " + paraKg(cesto.quantidadeDeFrutasMesmoTipo("FrutaPeso")));

        imprimeExercicio("d) Numero de frutas do mesmo tipo | Classe");
        System.out.println(("FrutaUnidade: " + cesto.numeroDeFrutasMesmoTipoClasse("FrutaUnidade")));
        System.out.println("FrutaVolume: " + cesto.numeroDeFrutasMesmoTipoClasse("FrutaVolume"));
        System.out.println("FrutaPeso: " + cesto.numeroDeFrutasMesmoTipoClasse("FrutaPeso"));

        imprimeExercicio("e) Valor a pagar em frutas do mesmo tipo");
        System.out.println("FrutaUnidade: " + montanteParaDuasCasas(cesto.valorGastoTipoFruta("FrutaUnidade")));
        System.out.println("FrutaVolume: " + montanteParaDuasCasas(cesto.valorGastoTipoFruta("FrutaVolume")));
        System.out.println("FrutaPeso: " + montanteParaDuasCasas(cesto.valorGastoTipoFruta("FrutaPeso")));

        return cesto;
    }

    public static void imprimirExercício3(Cesto cesto) {

        imprimeTitulo(3);

        imprimeExercicio("Descontos sem lista");

        FrutaPeso fAPeso = new FrutaPeso("Tabaibos", 20, 1.5f);
        FrutaVolume fAVolume = new FrutaVolume("Figos da india", 2, 2);

        System.out.println(fAPeso + "\n");
        System.out.println(fAPeso.getNome() + " antes - > " + montanteParaDuasCasas(fAPeso.pagar()));
        fAPeso.setPercentagemDesconto(15);
        System.out.println(fAPeso.getNome() + " desconto " + noDecimal.format(fAPeso.getPercentagemDesconto()) + "% - > " + montanteParaDuasCasas(fAPeso.descontar()));
        System.out.println(fAPeso.getNome() + " depois - > " + montanteParaDuasCasas(fAPeso.pagar()));

        System.out.println("\n" + fAVolume + "\n");
        System.out.println(fAVolume.getNome() + " antes - > " + montanteParaDuasCasas(fAVolume.pagar()));
        fAVolume.setPercentagemDesconto(20);
        System.out.println(fAVolume.getNome() + " desconto " + noDecimal.format(fAVolume.getPercentagemDesconto()) + "% - > " + montanteParaDuasCasas(fAVolume.descontar()));
        System.out.println(fAVolume.getNome() + " depois - > " + montanteParaDuasCasas(fAVolume.pagar()));

        imprimeExercicio("Descontos através da lista (Cesto)");

        System.out.println(cesto + "\n");
        // para conseguir fazer deste modo tive que adicionar o metodo setPercentagemDesconto() à interface -> para ser comum a todas as subclasses da Fruta que implementam o Descontavel.
        cesto.getFrutas().forEach(fruta -> {
            System.out.println("Antes -> " + fruta.getTipo() + " : " + montanteParaDuasCasas(fruta.pagar()));
            if (fruta instanceof FrutaPeso || fruta instanceof FrutaVolume) {
                ((Descontavel) fruta).setPercentagemDesconto(20);
            }
            System.out.println("Depois: " + montanteParaDuasCasas(fruta.pagar()));
        });

    }

    private static void imprimeTitulo(int numeroExercicio) {
        System.out.println("\n****** FICHA 4 -> EXERCÍCIO: " + numeroExercicio + " ******");
    }

    private static void imprimeExercicio(String tituloExercicio) {
        System.out.println("\n-------- " + tituloExercicio + " --------");
    }

    private static String montanteParaDuasCasas(double montante) {
        return doubleDigit.format(montante) + "€";
    }

    private static String paraKg(double peso) {
        return peso + " kg";
    }

    private static String paraVolume(double volume) {
        return (int) volume + " volumes";
    }

    private static String paraUnidades(double unidades) {
        return (int) unidades + " unidades";
    }

}
