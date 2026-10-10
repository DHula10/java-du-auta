package main.java.cz.vse.hula.auta.entities;

public abstract class Vozidlo {
    private String znacka;
    private String vin;
    private int maxRychlost;
    private double spotrebaPaliva;
    private String typPohonu;

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

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getMaxRychlost() {
        return maxRychlost;
    }

    public void setMaxRychlost(int maxRychlost) {
        this.maxRychlost = maxRychlost;
    }

    public double getSpotrebaPaliva() {
        return spotrebaPaliva;
    }

    public void setSpotrebaPaliva(double spotrebaPaliva) {
        this.spotrebaPaliva = spotrebaPaliva;
    }

    public String getTypPohonu() {
        return typPohonu;
    }

    public void setTypPohonu(String typPohonu) {
        this.typPohonu = typPohonu;
    }
}
