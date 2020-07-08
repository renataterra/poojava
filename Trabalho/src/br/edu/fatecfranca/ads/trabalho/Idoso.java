package br.edu.fatecfranca.ads.trabalho;

import java.util.ArrayList;
import java.util.Date;

public class Idoso {
    private String nome;
    private String dataNasc;
    private String CPF;
    private String RG;
    private String endereco;
    private String estadoCivil;
    private float altura;
    private float peso;
    private String telefone;
    private String enfermidades;
    private String alergiaMedicamentos;
    private ArrayList<Agenda> agendas;

    public Idoso() {
        this.agendas = new ArrayList();
    }

    public Idoso(String nome, String dataNasc, String CPF, String RG, String endereco, String estadoCivil, float altura, float peso, String telefone, String enfermidades, String alergiaMedicamentos, ArrayList<Agenda> agendas) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
        this.telefone = telefone;
        this.enfermidades = enfermidades;
        this.alergiaMedicamentos = alergiaMedicamentos;
        this.agendas = agendas;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnfermidades() {
        return enfermidades;
    }

    public void setEnfermidades(String enfermidades) {
        this.enfermidades = enfermidades;
    }

    public String getAlergiaMedicamentos() {
        return alergiaMedicamentos;
    }

    public void setAlergiaMedicamentos(String alergiaMedicamentos) {
        this.alergiaMedicamentos = alergiaMedicamentos;
    }

    public ArrayList<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(ArrayList<Agenda> agendas) {
        this.agendas = agendas;
    }
    
    public void addAgenda (Agenda agenda) {
        this.agendas.add(agenda);
    }
    
    @Override
    public String toString() {
        return "Idoso{" + "nome=" + nome + ", dataNasc=" + dataNasc + ", CPF=" + CPF + ", RG=" + RG + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + ", altura=" + altura + ", peso=" + peso + ", telefone=" + telefone + ", enfermidades=" + enfermidades + ", alergiaMedicamentos=" + alergiaMedicamentos + ", agendas=" + agendas + '}';
    }
}
