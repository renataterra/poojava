package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class LanHouse {
    private ArrayList<Computador> computadores;

    public LanHouse() {
        this.computadores = new ArrayList();
    }

    public LanHouse(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }
    
    public void addVeiculo(Computador computador) {
        this.computadores.add(computador);
    }

    @Override
    public String toString() {
        return "LanHouse{" + "computadores=" + computadores + this.computadores.toString() + '}';
    }
    
}
