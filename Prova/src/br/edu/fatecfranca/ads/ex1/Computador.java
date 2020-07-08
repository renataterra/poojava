package br.edu.fatecfranca.ads.ex1;

public class Computador {
    private String modo;
    private int memoriaRam;

    public Computador() {
    }

    public Computador(String modo, int memoriaRam) {
        this.modo = modo;
        this.memoriaRam = memoriaRam;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        if (memoriaRam >= 4 && memoriaRam <=32) {
        this.memoriaRam = memoriaRam;
        }
    }
    
    public void upgradeMemoriaRam(int x) {
        this.memoriaRam = this.memoriaRam + x;
    }
}
