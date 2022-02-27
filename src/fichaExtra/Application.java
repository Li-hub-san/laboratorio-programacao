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

    public static void main(String[] args) throws Exception {
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
                "\n" + petroleiro1.getId() +
                "\n" + formatarData(petroleiro1.getAnoConstrucao()) +
                "\n" + petroleiro1.getCapacidadeCarga() +
                "\n" + petroleiro1.getComprimento());
        System.out.println();

        System.out.println(cargueiro1.getNome() +
                "\n" + cargueiro1.getId() +
                "\n" + formatarData(cargueiro1.getAnoConstrucao()) +
                "\n" + cargueiro1.getMaxContentores() +
                "\n" + cargueiro1.getComprimento());
        System.out.println();

        return Arrays.asList(petroleiro1, cargueiro1);
    }

    public static void imprimirExercico2(List<Navio> navios) throws Exception {
        imprimeTitulo(2);
        Petroleiro petroleiro1 = new Petroleiro("Panamax", LocalDate.of(2002, 5, 12), 500, 564);

        PortaContentores portaContentores1 = new PortaContentores("Ever Glory", LocalDate.of(2021, 11, 5), 2013, 3000);

        Porto porto = new Porto();
        porto.adicionarNavio(petroleiro1);
        porto.adicionarNavio(portaContentores1);

        for (Navio navio : navios) {
            porto.adicionarNavio(navio);
        }

        imprimeExercicio("Lista de navios");
        System.out.println(porto);

        imprimeExercicio("Capacidade máxima total (contentores) todos os navios PortaContentores");
        System.out.println(porto.capacidadeMaximaTotalContentores() + " contentores");

        imprimeExercicio("Capacidade total todos os navios no Porto");
        System.out.println(porto.capacidadeTotalCarga() + " toneladas");
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
