package main.java.cz.vse.hula.auta;

import main.java.cz.vse.hula.auta.entities.Motocykl;
import main.java.cz.vse.hula.auta.entities.NakladniAuto;
import main.java.cz.vse.hula.auta.entities.OsobniAuto;
import main.java.cz.vse.hula.auta.entities.Vozidlo;
import main.java.cz.vse.hula.auta.service.Autosalon;

public class Main {
    private Main(){};

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
        } catch (IllegalStateException e){
            System.out.println("Test o odebrání neexistujícího vozidla vyšel: " + e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();
        salon.vypisVsechnaVozidla();

    }
}
