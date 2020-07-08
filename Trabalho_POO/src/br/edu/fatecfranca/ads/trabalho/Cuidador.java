package br.edu.fatecfranca.ads.trabalho;

import java.util.ArrayList;

public class Cuidador {
    private String nome;
    private String dataNasc;
    private String CPF;
    private String RG;
    private String endereco;
    private String estadoCivil;
    private String telefone;
    private ArrayList<Acao> acoes;

    public Cuidador() {
        this.acoes = new ArrayList();
    }

    public Cuidador(String nome, String dataNasc, String CPF, String RG, String endereco, String estadoCivil, String telefone, ArrayList<Acao> agendas) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.acoes = acoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Acao> getAgendas() {
        return acoes;
    }

    public void setAgendas(ArrayList<Acao> agendas) {
        this.acoes = agendas;
    }
    
    public void addAgenda (Acao agenda) {
        this.acoes.add(agenda);
    }
    
    public void addAcao(Acao acao) {
        this.acoes.add(acao);
    }
    public boolean removeAcao(Acao acao) {
        return this.acoes.remove(acao);
    }
    public int getAcao(Acao acao) {
        return this.acoes.indexOf(acao);
    }
    public boolean updateAcao(Acao atual, Acao nova) {
        int posicao = this.getAcao(atual);
        if (posicao != -1) {
            this.acoes.set(posicao, nova);
            return true;
        }
        else return false;
    }
    
    @Override
    public String toString() {
        return "Idoso{" + "nome=" + nome + ", dataNasc=" + dataNasc + ", CPF=" + CPF + ", RG=" + RG + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + ", telefone=" + telefone + ", acoes=" + this.acoes.toString() + '}';
    }
}
