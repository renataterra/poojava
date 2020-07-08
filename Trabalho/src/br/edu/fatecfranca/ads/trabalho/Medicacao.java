package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public class Medicacao extends Agenda {
    private String nome;

    public Medicacao() {
        super();
    }

    public Medicacao(String nome, String quantidade, String horario, boolean confirmar) {
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
        return "Medicacao{" + "nome=" + nome + super.toString() + '}';
    }
}
