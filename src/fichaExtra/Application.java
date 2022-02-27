package fichaExtra;

import fichaExtra.navio.Petroleiro;
import fichaExtra.navio.PortaContentores;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application {

    public static void main(String[] args) {
        Petroleiro petroleiro = new Petroleiro("123AF", "Armas", new GregorianCalendar(1995, Calendar.JANUARY, 1).getTime(), 3000_000f);

        PortaContentores cargueiro = new PortaContentores("afd1jkl", "Armas", new GregorianCalendar(2015, Calendar.JANUARY, 22).getTime(), 5_000f);

        System.out.println(petroleiro);
        System.out.println(cargueiro);

        System.out.println(petroleiro.getCapacidadeCarga());
        System.out.println(cargueiro.getMaxContentores());
    }


}
