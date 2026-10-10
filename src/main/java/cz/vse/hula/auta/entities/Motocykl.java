package main.java.cz.vse.hula.auta.entities;

public class Motocykl extends Vozidlo{
    private boolean maPostranniVozik;

    public Motocykl(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, boolean maPostranniVozik) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.maPostranniVozik = maPostranniVozik;
    }

    public boolean isMaPostranniVozik() {
        return maPostranniVozik;
    }

    public void setMaPostranniVozik(boolean maPostranniVozik) {
        this.maPostranniVozik = maPostranniVozik;
    }

    @Override
    public String toString() {
        return super.toString() + "Postranní vozík: " + (maPostranniVozik ? "S vozíkem" : "Bez vozíku");
    }
}
