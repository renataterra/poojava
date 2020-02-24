package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TestaRio {
    public static void main(String[] args) {
        // criando objetos
        String nome = JOptionPane.showInputDialog("Informe o nome do rio");
        float nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível do rio"));
        int aux = JOptionPane.showConfirmDialog(null, "Está poluído?", "Está poluído?", JOptionPane.YES_NO_OPTION);
        boolean poluido = (aux == JOptionPane.YES_OPTION);
        
        Rio obj1 = new Rio(nome, nivel, poluido);
        obj1.chover(10);
        obj1.ensolarar(5);
        obj1.limpar ();
        obj1.sujar ();
        
        Rio obj2 = new Rio("São Francisco", 1, false);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
}
