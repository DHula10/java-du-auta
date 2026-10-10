package main.java.cz.vse.hula.auta.entities;

/**
 * Třída OsobniAuto reprezentuje osobní vozidlo.
 * Dědí ze třídy Vozidlo a přidává specifický atribut pro počet dveří.
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public class OsobniAuto extends Vozidlo{
    private int pocetDveri;

    /**
     * Konstruktor pro vytvoření osobního auta.
     *
     * @param znacka            značka vozidla
     * @param vin               unikátní VIN kód
     * @param maxRychlost       maximální rychlost v km/h
     * @param spotrebaPaliva    spotřeba paliva
     * @param typPohonu         typ pohonu
     * @param pocetDveri        počet dveří vozidla
     */
    public OsobniAuto(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, int pocetDveri) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.pocetDveri = pocetDveri;
    }

    /**
     * Vrací počet dveří osobního auta.
     * @return  počet dveří
     */
    public int getPocetDveri() {
        return pocetDveri;
    }

    /**
     * Nastaví počet dveří osobního auta.
     * @param pocetDveri    nový počet dveří
     */
    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    /**
     * Vrací textovou reprezentaci osobního auta včetně počtu dveří.
     * @return  formátovaný řetězec
     */
    @Override
    public String toString() {
        return super.toString() + ", Počet dveří: " + pocetDveri;
    }
}
