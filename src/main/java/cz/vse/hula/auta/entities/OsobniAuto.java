package main.java.cz.vse.hula.auta.entities;

public class OsobniAuto extends Vozidlo{
    private int pocetDveri;

    public OsobniAuto(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, int pocetDveri) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.pocetDveri = pocetDveri;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    @Override
    public String toString() {
        return super.toString() + ", Počet dveří: " + pocetDveri;
    }
}
