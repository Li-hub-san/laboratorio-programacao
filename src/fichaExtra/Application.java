package fichaExtra;

import fichaExtra.navio.Navio;
import fichaExtra.navio.Petroleiro;
import fichaExtra.navio.PortaContentores;
import fichaExtra.navio.Porto;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Navio> navios = imprimirExercicio1();
        imprimirExercico2(navios);
    }

    private static List<Navio> imprimirExercicio1() {
        imprimeTitulo(1);
        imprimeExercicio("Instaciar subclasses");

        Petroleiro petroleiro1 = new Petroleiro("Aframax", LocalDate.of(1995, Month.JANUARY, 1), 30000, 500);

        PortaContentores cargueiro1 = new PortaContentores("Armas", LocalDate.of(2015, Month.FEBRUARY, 9), 5000, 200);

        System.out.println(petroleiro1);
        System.out.println(cargueiro1);
        System.out.println();

        System.out.println(petroleiro1.getNome() +
                "\n" + formatarData(petroleiro1.getAnoConstrucao()) +
                "\n" + petroleiro1.getCapacidadeCarga() +
                "\n" + petroleiro1.getComprimento());
        System.out.println();

        System.out.println(cargueiro1.getNome() +
                "\n" + formatarData(cargueiro1.getAnoConstrucao()) +
                "\n" + cargueiro1.getMaxContentores() +
                "\n" + cargueiro1.getComprimento());
        System.out.println();

        return Arrays.asList(petroleiro1, cargueiro1);
    }

    public static void imprimirExercico2(List<Navio> navios) {
        imprimeTitulo(2);
        Petroleiro petroleiro2 = new Petroleiro("Panamax", LocalDate.of(2002, 5, 12), 500, 564);

        PortaContentores portaContentores2 = new PortaContentores("Ever Glory", LocalDate.of(2021, 11, 5), 2013, 3000);

        Porto porto1 = new Porto();
        porto1.adiconarNavios(petroleiro2);
        porto1.adiconarNavios(portaContentores2);
        navios.forEach(porto1::adiconarNavios
        );

        imprimeExercicio("Lista de navios");
        System.out.println(porto1);

        imprimeExercicio("Capacidade máxima total (contentores) todos os navios PortaContentores");
        System.out.println(porto1.capacidadeMaximaTotalContentores() + " contentores");

        imprimeExercicio("Capacidade total todos os navios no Porto");
        System.out.println(porto1.capacidadeTotalCarga() + " toneladas");
    }

    private static int formatarData(LocalDate anoConstrucao) {
        return anoConstrucao.getYear();
    }

    private static void imprimeTitulo(int numeroExercicio) {
        System.out.println("\n****** FICHA EXTRA -> EXERCÍCIO: " + numeroExercicio + " ******");
    }

    private static void imprimeExercicio(String tituloExercicio) {
        System.out.println("\n-------- " + tituloExercicio + " --------");
    }


}
