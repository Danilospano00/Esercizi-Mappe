package org.corso.mappe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Macchina> listaMacchine = new ArrayList<>();
        App app = new App();

        listaMacchine.add(new Macchina("Lambo", 2001, new Motore(500)));
        listaMacchine.add(new Macchina("Mercedes", 2005, new Motore(500)));
        listaMacchine.add(new Macchina("Volvo", 2001, new Motore(500)));
        listaMacchine.add(new Macchina("Rolls", 2001, new Motore(1400)));
        listaMacchine.add(new Macchina("Peugeot", 2005, new Motore(1400)));
    }

    public void stampaTutte(List<Macchina> listaMacchine) {
        for (Macchina item : listaMacchine) {
            System.out.println("Modello: " + item.getModello() + ", anno: " + item.getAnno());
        }
    }

    public void togli2001(List<Macchina> listaMacchine) {
        Iterator<Macchina> iter = listaMacchine.iterator();
        while (iter.hasNext()) {
            Macchina item = iter.next();
            if (item.getAnno() == 2001) {
                iter.remove();
            }
        }

    }

    public void stampaLista(List<Macchina> listaMacchine) {
        for (Macchina macchina : listaMacchine) {
            System.out.println(macchina.getAnno());
        }

    }

    public void stampaCilindrata(List<Macchina> listaMacchine) {
        Iterator<Macchina> iter = listaMacchine.iterator();
        while (iter.hasNext()) {
            Macchina item = iter.next();
            if (item.getMotore().getCilindrata() == 1400) {
                System.out.println("Modello: " + item.getModello() + "  Anno: " + item.getAnno() + "  Cilindrata: " + item.getMotore().getCilindrata());
            }
        }

    }

}
