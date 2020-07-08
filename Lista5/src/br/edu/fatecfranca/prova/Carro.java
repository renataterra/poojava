package br.edu.fatecfranca.prova;

public class Carro extends Veiculo {
    private float capPortaMala;
    
    public Carro() {
        super();
    }
    
    public Carro(float capPortaMala, String modelo, int ano) {
        super(modelo, ano);
        this.capPortaMala = capPortaMala;
    }

    public float getCapPortaMala() {
        return capPortaMala;
    }

    public void setCapPortaMala(float capPortaMala) {
        this.capPortaMala = capPortaMala;
    }

    @Override
    public String toString() {
        return "Carro{" + "capPortaMala=" + capPortaMala + super.toString() + '}';
    }
    
}
