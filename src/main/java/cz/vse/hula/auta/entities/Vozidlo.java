package main.java.cz.vse.hula.auta.entities;

import java.util.Objects;

/**
 * Abstraktní třída Vozidlo - slouží jako předek pro všechny konkrétní typy vozidel.
 * Obsahuje společné vlastnosti jako značku, VIN kód, rychlost, spotřebu a typ pohonu.
 *
 * @author Dominik Hula
 * @version 1.0.0
 */
public abstract class Vozidlo {
    private String znacka;
    private String vin;
    private int maxRychlost;
    private double spotrebaPaliva;
    private String typPohonu;

    /**
     * Konstruktor pro vytvoření obecného vozidla.
     *
     * @param znacka            značka vozidla (např. Škoda, Volvo)
     * @param vin               unikátní identifikační číslo vozidla (VIN)
     * @param maxRychlost       maximální rychlost v km/h
     * @param spotrebaPaliva    průměrná spotřeba paliva
     * @param typPohonu         typ pohonu (např. Benzin, Nafta)
     * @throws IllegalArgumentException pokud je VIN nebo značka null či prázdný řetězec
     */
    public Vozidlo(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu) {
        if (vin == null || vin.trim().isEmpty()) {
            throw new IllegalArgumentException("VIN nemůže být prázdný");
        }
        if (znacka == null || znacka.trim().isEmpty()) {
            throw new IllegalArgumentException("Značka nemůže být prázdná");
        }

        this.znacka = znacka;
        this.vin = vin;
        this.maxRychlost = maxRychlost;
        this.spotrebaPaliva = spotrebaPaliva;
        this.typPohonu = typPohonu;
    }

    /**
     * Vrací značku vozidla.
     * @return  značka vozidla
     */
    public String getZnacka() {
        return znacka;
    }

    /**
     * Nastaví značku vozidla.
     * @param znacka    nová značka
     */
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    /**
     * Vrací VIN kód vozidla.
     * @return  VIN kód
     */
    public String getVin() {
        return vin;
    }

    /**
     * Nastaví nový VIN kód vozidla.
     * @param vin   nový VIN kód
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * Vrací maximální rychlost vozidla.
     * @return  maximální rychlost
     */
    public int getMaxRychlost() {
        return maxRychlost;
    }

    /**
     * Nastaví maximální rychlost vozidla.
     * @param maxRychlost   nová maximální rychlost
     */
    public void setMaxRychlost(int maxRychlost) {
        this.maxRychlost = maxRychlost;
    }

    /**
     * Vrací spotřebu paliva vozidla.
     * @return  spotřeba paliva
     */
    public double getSpotrebaPaliva() {
        return spotrebaPaliva;
    }

    /**
     * Nastaví spotřebu paliva vozidla.
     * @param spotrebaPaliva    nová spotřeba paliva
     */
    public void setSpotrebaPaliva(double spotrebaPaliva) {
        this.spotrebaPaliva = spotrebaPaliva;
    }

    /**
     * Vrací typ pohonu vozidla.
     * @return  typ pohonu
     */
    public String getTypPohonu() {
        return typPohonu;
    }

    /**
     * Nastaví typ pohonu vozidla.
     * @param typPohonu nový typ pohonu
     */
    public void setTypPohonu(String typPohonu) {
        this.typPohonu = typPohonu;
    }

    /**
     * Porovnává toto vozidlo s jiným objektem. Dvě vozidla jsou považována za shodná, pokud mají stejný VIN kód.
     *
     * @param o objekt k porovnání
     * @return  true, pokud se jedná o stejné vozidlo, jinak false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vozidlo vozidlo = (Vozidlo) o;
        return Objects.equals(vin, vozidlo.vin);
    }

    /**
     * Generuje hash kód na základě VIN kódu pro správné fungování v kolekcích.
     * @return  číselný hash kód
     */
    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    /**
     * Vrací textovou reprezentaci vozidla.
     *
     * @return  formátovaný řetězec s informacemi o vozidle
     */
    @Override
    public String toString() {
        return "Vozidlo {" +
                "Značka: '" + znacka + '\'' +
                ", VIN: '" + vin + '\'' +
                ", Max rychlost : " + maxRychlost +
                ", Spotřeba : " + spotrebaPaliva +
                ", Typ pohonu : '" + typPohonu + '\'' +
                '}';
    }
}
