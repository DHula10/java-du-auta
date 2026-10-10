package main.java.cz.vse.hula.auta;

import main.java.cz.vse.hula.auta.entities.Motocykl;
import main.java.cz.vse.hula.auta.entities.NakladniAuto;
import main.java.cz.vse.hula.auta.entities.OsobniAuto;
import main.java.cz.vse.hula.auta.entities.Vozidlo;
import main.java.cz.vse.hula.auta.service.Autosalon;

/**
 * Hlavní spouštěcí třída aplikace Autosalon
 * Slouží jako vstupní bod programu, ve kterém se vytváří instance autosalonu a testuje se jeho základní funkcionalita
 * (přidávání, odebírání, výpisy).
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public class Main {

    /**
     * Privátní konstruktor
     */
    private Main(){};

    /**
     * Hlavní metoda, prostřednictvím níž se spouští celá aplikace.
     * Inicializuje autosalon, plní jej daty a demonstruje odchytávání výjimek.
     *
     * @param args  parametry příkazového řádku (v tomto projetku nevyužito)
     */
    public static void main(String[] args){
        Autosalon salon = new Autosalon();

        Vozidlo auto = new OsobniAuto("Škoda", "VIN123456", 200, 6.5, "Benzin", 5);
        Vozidlo nakladak = new NakladniAuto("Volvo", "VIN987654", 90, 25, "Nafta", 12.5);
        Vozidlo motorka = new Motocykl("Honda", "VIN456789", 250, 4.0, "Benzin", false);

        System.out.println("START AUTOSALONU");

        try {
            salon.pridatVozidlo(auto);
            salon.pridatVozidlo(nakladak);
            salon.pridatVozidlo(motorka);
        } catch(IllegalArgumentException e){
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();
        salon.vypisVsechnaVozidla();

        System.out.println("Pokus o přidání duplikátu");
        try {
            Vozidlo autoDuplikat = new OsobniAuto("Škoda", "VIN123456", 200, 6.5, "Benzin", 5);
            salon.pridatVozidlo(autoDuplikat);
        } catch (IllegalArgumentException e){
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Pokus o odebrání vozidla");
        try{
            salon.odebratVozidlo(motorka);

            System.out.println("Pokus o odberání stejného vozidla znovu.");

            salon.odebratVozidlo(motorka); // Přidáno pro reálné vyvolání chyby u druhého odebírání
        } catch (IllegalStateException e){
            System.out.println("Test o odebrání neexistujícího vozidla vyšel: " + e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();
        salon.vypisVsechnaVozidla();

        System.out.println("Vyhledávání voziádel podle VIN");

        // 1. Scénář: Hledání vozidla, které v autosalonu je
        System.out.println("Hledá se VIN123456 (Škoda):");
        Vozidlo nalezeneAuto = salon.vyhledatVozidlo("VIN123456");

        if (nalezeneAuto != null) {
            System.out.println("Úspěšně nalezeno: " + nalezeneAuto.toString());
        }

        System.out.println();

        // 2. Scénář: Hledání vozidla, které v autosalonu není
        System.out.println("Hledá se VIN999999:");
        Vozidlo nenalezeneAuto = salon.vyhledatVozidlo("VIN999999");

        if (nenalezeneAuto != null) {
            System.out.println("Nalezeno: " + nenalezeneAuto.toString());
        }
    }
}
