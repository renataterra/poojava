package br.edu.fatecfranca.ads;
public class Produto {
     // variáveis
    String descricao;
    int id, qtde;
    float preco;
    
    //método construtor
    public Produto (String descricao, int id, int qtde, float preco) {
        this.descricao = descricao;
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public Produto () {
        
    }
    
    Produto(String desc, String ma, int id, int qtde, float pcr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // métodos
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
    public String mostra() {
        return "ID: " + this.id +
                "\n Descrição: " + this.descricao +
                "\n Quantidade: " + this.qtde +
                "\n Preço: " + this.preco;
    }  
}
