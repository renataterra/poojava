package br.edu.fatecfranca.ads.ex2;

public class Disciplina {
    private int id;
    private String nome;
    
    public Disciplina() {
    
    }
    
    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n Disciplina{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}
