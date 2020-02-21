package br.edu.fatecfranca.ads;

public class Rio {
    // variáveis
    String nome;
    boolean poluido;
    float nivel;
    
    //método construtor
    public Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.poluido = poluido;
        this.nivel = nivel;
    }

    public Rio() {
        
    }
    // métodos
    public void chover(float x) {
        this.nivel = this.nivel + x;
    }
    public void ensolarar(float x) {
        this.nivel = this.nivel - x;
    }
    public void limpar() {
        this.poluido = false;
    }
    public void sujar() {
        this.poluido = true;
    }
        public String mostra() {
        return "Nome do rio: " + this.nome +
                "\n Nível: " + this.nivel +
                "\n Poluído: " + this.poluido;
    }
}
