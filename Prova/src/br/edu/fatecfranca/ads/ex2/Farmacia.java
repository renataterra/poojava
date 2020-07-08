package br.edu.fatecfranca.ads.ex2;

import java.util.ArrayList;

public class Farmacia {
    private String nome;
    private String cnpj;
    private ArrayList<Remedio> remedios;

    public Farmacia() {
        remedios = new ArrayList();
    }

    public Farmacia(String nome, String cnpj, ArrayList<Remedio> remedios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.remedios = remedios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Remedio> getRemedios() {
        return remedios;
    }

    public void setRemedios(ArrayList<Remedio> remedios) {
        this.remedios = remedios;
    }

    @Override
    public String toString() {
        return "Farmacia{" + "nome=" + nome + ", cnpj=" + cnpj + ", remedios=" + remedios + '}';
    }
    
    public void addRemedio(Remedio remedio) {
        this.remedios.add(remedio);
    }
    public boolean removeRemedio(Remedio remedio) {
        return this.remedios.remove(remedio);
    }
    public int getRemedio(Remedio remedio) {
        return this.remedios.indexOf(remedio);
    }
    public boolean updateRemedio(Remedio atual, Remedio novo) {
        int posicao = this.getRemedio(atual);
        if (posicao != -1) {
            this.remedios.set(posicao, novo);
            return true;
        }
        else return false;
    }
}
