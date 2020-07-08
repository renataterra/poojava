package br.edu.fatecfranca.ads.trabalho;

public class DarAlimentacao extends Acao {
    private String nome;

    public DarAlimentacao() {
        super();
    }

    public DarAlimentacao(String nome, String quantidade, String horario, boolean confirmar) {
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
