package br.edu.fatecfranca.ads.ex4;

public class Cidade {
    private String nome;
    private int populacao;

    public Cidade() {
    }

    public Cidade(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", populacao=" + populacao + '}';
    }
    
}
