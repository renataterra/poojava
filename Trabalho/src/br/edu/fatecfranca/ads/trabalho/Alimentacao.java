package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public class Alimentacao extends Agenda {
    private String nome;

    public Alimentacao() {
        super();
    }

    public Alimentacao(String nome, String quantidade, String horario, boolean confirmar) {
        super(quantidade, horario, confirmar);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Alimentacao{" + "nome=" + nome + super.toString() +'}';
    }
    
}
