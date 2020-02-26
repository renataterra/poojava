package br.edu.fatecfranca.ads.ex1;

/* UML
- id: int
- qtde: int
- descricao: string
- preco: float
+ comprar(int): void
+ vender(int): void
+ subir(float): void
+ descer(float): void
*/

public class Produto {
    private int id, qtde;
    private String descricao;
    private float preco;
    
    public Produto (String descricao, int id, int qtde, float preco) {
        this.descricao = descricao;
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    public void vender(int x) {
        this.qtde = this.qtde - x;
    }
    public void subir(float x) {
        this.preco = this.preco + x;
    }
    public void descer(float x) {
        this.preco = this.preco - x;
    }
    public String toString() {
        return "ID: " + this.id +
                "\n Descrição: " + this.descricao +
                "\n Quantidade: " + this.qtde +
                "\n Preço: " + this.preco;
    }  
}
