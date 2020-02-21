package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class TestaProduto {
    
    public static void main(String[] args) {
        // criando objetos
        String desc = JOptionPane.showInputDialog("Informe a descrição do produto");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto"));
        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
        float pcr = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço"));
        
        Produto obj1 = new Produto(desc, id, qtde, pcr);
        obj1.comprar(10);
        obj1.vender(30);
        obj1.subir (5);
        obj1.descer (4);
        
        Produto obj2 = new Produto();
        obj2.descricao = desc;
        obj2.id = id;
        obj2.preco = pcr;
        obj2.qtde = qtde;
        
        obj2.comprar(20);
        obj2.vender(40);
        obj2.subir (10);
        obj2.descer (8);
        
        JOptionPane.showMessageDialog(null, obj1.mostra());
        JOptionPane.showMessageDialog(null, obj2.mostra());
    }
}
