package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Onibus {
    private int numero;
    private String placa;
    private ArrayList<Passageiro> passageiros;

    public Onibus() {
        passageiros = new ArrayList();
    }

    public Onibus(int numero, String placa, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.placa = placa;
        this.passageiros = passageiros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "Onibus{" + "numero=" + numero + ", placa=" + placa + '}';
    }
    
    public void addPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }
    public boolean removePassageiro(Passageiro passageiro) {
        return this.passageiros.remove(passageiro);
    }
    public int getPassageiro(Passageiro passageiro) {
        return this.passageiros.indexOf(passageiro);
    }
    public boolean updatePassageiro(Passageiro atual, Passageiro novo) {
        int posicao = this.getPassageiro(atual);
        if (posicao != -1) {
            this.passageiros.set(posicao, novo);
            return true;
        }
        else return false;
    }
}
