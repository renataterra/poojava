package br.edu.fatecfranca.ads.ex4;

import java.util.ArrayList;

public class Estado {
    private String nome;
    private String iniciais;
    private ArrayList<Cidade> cidades;

    public Estado() {
        cidades = new ArrayList();
    }

    public Estado(String nome, String iniciais, ArrayList<Cidade> cidades) {
        this.nome = nome;
        this.iniciais = iniciais;
        this.cidades = cidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIniciais() {
        return iniciais;
    }

    public void setIniciais(String iniciais) {
        this.iniciais = iniciais;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Estado{" + "nome=" + nome + ", iniciais=" + iniciais + ", cidades=" + cidades + '}';
    }
    
    public void addCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }
    public boolean removeCidade(Cidade cidade) {
        return this.cidades.remove(cidade);
    }
    public int getCidade(Cidade cidade) {
        return this.cidades.indexOf(cidade);
    }
    public boolean updateCidade(Cidade atual, Cidade nova) {
        int posicao = this.getCidade(atual);
        if (posicao != -1) {
            this.cidades.set(posicao, nova);
            return true;
        }
        else return false;
    }
}
