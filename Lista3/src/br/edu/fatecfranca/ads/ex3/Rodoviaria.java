package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Rodoviaria {
    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibuss;

    public Rodoviaria() {
        onibuss = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibuss) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibuss = onibuss;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibuss() {
        return onibuss;
    }

    public void setOnibuss(ArrayList<Onibus> onibuss) {
        this.onibuss = onibuss;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibuss=" + onibuss + '}';
    }
    
    public void addOnibus(Onibus onibus) {
        this.onibuss.add(onibus);
    }
    public boolean removeOnibus(Onibus onibus) {
        return this.onibuss.remove(onibus);
    }
    public int getOnibus(Onibus onibus) {
        return this.onibuss.indexOf(onibus);
    }
    public boolean updateOnibus(Onibus atual, Onibus novo) {
        int posicao = this.getOnibus(atual);
        if (posicao != -1) {
            this.onibuss.set(posicao, novo);
            return true;
        }
        else return false;
    }
}
