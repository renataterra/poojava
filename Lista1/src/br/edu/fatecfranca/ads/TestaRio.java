package br.edu.fatecfranca.ads;

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
        obj1.ensolarar(30);
        obj1.limpar ();
        obj1.sujar ();
        
        Rio obj2 = new Rio();
        obj2.nome = nome;
        obj2.nivel = nivel;
        obj2.poluido = poluido;
        
        obj2.chover(20);
        obj2.ensolarar(40);
        obj2.limpar ();
        obj2.sujar ();
        
        JOptionPane.showMessageDialog(null, obj1.mostra());
        JOptionPane.showMessageDialog(null, obj2.mostra());
    }
}
