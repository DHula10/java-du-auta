package main.java.cz.vse.hula.auta.entities;

/**
 * Třída Motocykl reprezentuje motocykly.
 * Dědí ze třídy Vozidlo a přidává informaci o přítomnosti postranního vozíku.
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public class Motocykl extends Vozidlo{
    private boolean maPostranniVozik;

    /**
     * Konstruktor pro vytvoření motocyklu.
     *
     * @param znacka            značka motocyklu
     * @param vin               unikátní VIN kód
     * @param maxRychlost       maximální rychlost v km/h
     * @param spotrebaPaliva    spotřeba paliva
     * @param typPohonu         typ pohonu
     * @param maPostranniVozik  true, pokud má motocykl postranní vozík
     */
    public Motocykl(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, boolean maPostranniVozik) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.maPostranniVozik = maPostranniVozik;
    }

    /**
     * Zjistí, zda má motocykl postranní vozík.
     * @return  true, pokud má vozík, jinak false
     */
    public boolean isMaPostranniVozik() {
        return maPostranniVozik;
    }

    /**
     * Nastaví informaci o přítomnosti postranního vozíku.
     * @param maPostranniVozik  true pro přidání vozíku, false pro jeho odebrání
     */
    public void setMaPostranniVozik(boolean maPostranniVozik) {
        this.maPostranniVozik = maPostranniVozik;
    }

    /**
     * Vrací textovou reprezentaci motocyklu včetně informace o postranním vozíku.
     * @return  formátovaný řetězec
     */
    @Override
    public String toString() {
        return super.toString() + ", Postranní vozík: " + (maPostranniVozik ? "S vozíkem" : "Bez vozíku");
    }
}
