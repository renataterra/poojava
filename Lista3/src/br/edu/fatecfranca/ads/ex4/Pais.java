package br.edu.fatecfranca.ads.ex4;

import java.util.ArrayList;

public class Pais {
    private String continente;
    private String iniciais;
    private String nome;
    private ArrayList<Estado> estados;

    public Pais() {
        estados = new ArrayList();
    }

    public Pais(String continente, String iniciais, ArrayList<Estado> estados) {
        this.continente = continente;
        this.iniciais = iniciais;
        this.nome = nome;
        this.estados = estados;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIniciais() {
        return iniciais;
    }

    public void setIniciais(String iniciais) {
        this.iniciais = iniciais;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Pais{" + "continente=" + continente + ", iniciais=" + iniciais + ", nome=" + nome + ", estados=" + this.estados + '}';
    }
    
    public void addEstado(Estado estado) {
        this.estados.add(estado);
    }

    public boolean removeEstado(Estado estado) {
        return this.estados.remove(estado);
    }
    public int getEstado(Estado estado) {
        return this.estados.indexOf(estado);
    }
    public boolean updateEstado(Estado atual, Estado novo) {
        int posicao = this.getEstado(atual);
        if (posicao != -1) {
            this.estados.set(posicao, novo);
            return true;
        }
        else return false;
    }
    public boolean addCidadeEstado(Cidade cidade, Estado estado) {
        int posicao = this.getEstado(estado);
        if (posicao != -1) {
            estado.addCidade(cidade);
            return true;
        }
        else return false;
    }
}
