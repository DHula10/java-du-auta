package main.java.cz.vse.hula.auta.service;

import main.java.cz.vse.hula.auta.entities.Vozidlo;

import java.util.ArrayList;
import java.util.List;

public class Autosalon {
    private List<Vozidlo> vozidla;

    public Autosalon() {
        this.vozidla = new ArrayList<>();
    }

    public void pridatVozidlo(Vozidlo noveVozidlo) {
        if (noveVozidlo == null) {
            throw new IllegalArgumentException("Nelze přidat prázdné vozidlo.");
        }

        boolean existujeVozidlo = vozidla.contains(noveVozidlo);

        if (existujeVozidlo) {
            throw new IllegalArgumentException("Vozidlo s VIN: " + noveVozidlo.getVin() + " již existuje.");
        }

        vozidla.add(noveVozidlo);
        System.out.println("Přidáno vozidlo: " +  noveVozidlo.getZnacka() + " " + noveVozidlo.getVin());
    }

    public void odebratVozidlo(Vozidlo odebiraneVozidlo) {
        if (odebiraneVozidlo == null) {
            throw new IllegalArgumentException("Nelze odebrat prázdné vozidlo.");
        }

        if (!vozidla.contains(odebiraneVozidlo)) {
            throw new IllegalStateException("Toto vozidlo se v autosalonu nenachází.");
        }

        vozidla.remove(odebiraneVozidlo);
        System.out.println("Odebráno vozidlo: " + odebiraneVozidlo.getZnacka() + " " + odebiraneVozidlo.getVin());
    }

    public Vozidlo vyhledatVozidlo(String vin) {
        for (Vozidlo v : vozidla) {
            if (v.getVin().equals(vin)) {
                return v;
            }
        }

        System.out.println("Vozidlo nenalezeno");
        return null;
    }

    public void vypisVsechnaVozidla() {
        System.out.println("SEZNAM VOZIDEL V AUTOSALONU");

        if(vozidla.isEmpty()) {
            System.out.println("Autosalon je momentálně prázdný");
        } else {
            for (Vozidlo v : vozidla) {
                System.out.println(v.toString());
            }
        }
    }
}
