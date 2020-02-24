package br.edu.fatecfranca.ads.ex1;

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
        obj1.vender(8);
        obj1.subir (5);
        obj1.descer (4);
        
        Produto obj2 = new Produto("coco", 2, 5, 20);

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
}
