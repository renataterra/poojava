package br.edu.fatecfranca.ads.ex1;

public class Voo {
    private String nro, destino;

    public Voo() {
    }

    public Voo(String nro, String destino) {
        this.nro = nro;
        this.destino = destino;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo: " + "nro=" + nro +
               "\n destino=" + destino;
    }
    
    
}
