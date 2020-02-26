package br.edu.fatecfranca.ads.ex2;

/* UML
- nome: string
- poluido: boolean
- nivel: float
+ chover(float): void
+ ensolarar(float): void
+ limpar(): void
+ sujar(): void
*/

public class Rio {
    private String nome;
    private boolean poluido;
    private float nivel;
    
    public Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.poluido = poluido;
        this.nivel = nivel;
    }

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
        public String toString() {
        return "Nome do rio: " + this.nome +
                "\n Nível: " + this.nivel +
                "\n Poluído: " + this.poluido;
    }
}
