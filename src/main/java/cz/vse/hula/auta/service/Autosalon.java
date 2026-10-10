package main.java.cz.vse.hula.auta.service;

import main.java.cz.vse.hula.auta.entities.Vozidlo;

import java.util.ArrayList;
import java.util.List;

/**
 * Třída Autosalon představuje evidenci vozidel.
 * Udržuje seznam všech vozidel a umožňuje jejich přidávání, odebírání a vyhledávání.
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public class Autosalon {
    private List<Vozidlo> vozidla;

    /**
     * Konstruktor třídy Autosalon
     * Inicializuje prázdný seznam pro uchovávání vozidel.
     */
    public Autosalon() {
        this.vozidla = new ArrayList<>();
    }

    /**
     * Přidá nové vozidlo do autosalonu.
     * Zkontroluje, zda vozidlo není null a zda v evidenci již neexistuje duplikát (vozidlo se stejným VIN)
     *
     * @param noveVozidlo   vozidlo, které chceme přidat
     * @throws IllegalArgumentException pokud je předané vozidlo null nebo již v evidenci existuje
     */
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

    /**
     * Odebere existující vozidlo z autosalonu.
     *
     * @param odebiraneVozidlo  vozidlo k odebrání
     * @throws IllegalArgumentException pokud je vozidlo null
     * @throws IllegalStateException    pokud se vozidlo v autosalonu nenachází
     */
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

    /**
     * Vyhledá vozidlo v autosalonu podle zadaného VIN kódu.
     *
     * @param vin hledaný VIN kód
     * @return  nalezené vozidlo, nebo null, pokud vozidlo nebylo nalezeno
     */
    public Vozidlo vyhledatVozidlo(String vin) {
        for (Vozidlo v : vozidla) {
            if (v.getVin().equals(vin)) {
                return v;
            }
        }

        System.out.println("Vozidlo nenalezeno");
        return null;
    }

    /**
     * Vypíše všechna evidovaná vozidla v autosalonu.
     * Pokud je autosalon prádzný, upozorní na to.
     */
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
