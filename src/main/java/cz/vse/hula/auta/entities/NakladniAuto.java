package main.java.cz.vse.hula.auta.entities;

/**
 * Třída NakladniAuto reprezentuje nákla dní vozidlo.
 * Dědí ze třídy Vozidlo a přidává atribut pro maximální nosnost.
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public class NakladniAuto extends Vozidlo{
    private double nosnostTun;

    /**
     * Konstruktor pro vytvoření nákladního auta.
     *
     * @param znacka            značka vozidla
     * @param vin               unikátní VIN kód
     * @param maxRychlost       maximální rychlost v km/h
     * @param spotrebaPaliva    spotřeba paliva
     * @param typPohonu         typ pohonu
     * @param nosnostTun        maximální nosnost v tunách
     */
    public NakladniAuto(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, double nosnostTun) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.nosnostTun = nosnostTun;
    }

    /**
     * Vrací maximální nosnost nákladního auta.
     * @return  nosnost v tunách
     */
    public double getNosnostTun() {
        return nosnostTun;
    }

    /**
     * Nastaví maximální nosnost nákladního auta.
     * @param nosnostTun    nová nosnost v tunách
     */
    public void setNosnostTun(double nosnostTun) {
        this.nosnostTun = nosnostTun;
    }

    /**
     * Vrací textovou reprezentaci nákladního auta včetně jeho nosnosti.
     * @return  formátovaný řetězec
     */
    @Override
    public String toString() {
        return super.toString() + ", Nosnost tun: " + nosnostTun;
    }
}
