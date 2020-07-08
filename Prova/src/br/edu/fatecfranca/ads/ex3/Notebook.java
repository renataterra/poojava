package br.edu.fatecfranca.ads.ex3;

public class Notebook extends Computador{
    private float capBat;

    public Notebook() {
        super();
    }

    public Notebook(float capBat, String descrição) {
        super(descrição);
        this.capBat = capBat;
    }

    public float getCapBat() {
        return capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }

    @Override
    public String toString() {
        return "Notebook{" + "capBat=" + capBat + super.toString() + '}';
    }
}
