package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public class DarMedicacao extends Acao {
    private String nome;

    public DarMedicacao() {
        super();
    }

    public DarMedicacao(String nome, String quantidade, String horario, boolean confirmar) {
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
