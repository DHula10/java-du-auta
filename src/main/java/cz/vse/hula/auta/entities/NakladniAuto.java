package main.java.cz.vse.hula.auta.entities;

public class NakladniAuto extends Vozidlo{
    private double nosnostTun;

    public NakladniAuto(String znacka, String vin, int maxRychlost, double spotrebaPaliva, String typPohonu, double nosnostTun) {
        super(znacka, vin, maxRychlost, spotrebaPaliva, typPohonu);
        this.nosnostTun = nosnostTun;
    }

    public double getNosnostTun() {
        return nosnostTun;
    }

    public void setNosnostTun(double nosnostTun) {
        this.nosnostTun = nosnostTun;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nosnost tun: " + nosnostTun;
    }
}
