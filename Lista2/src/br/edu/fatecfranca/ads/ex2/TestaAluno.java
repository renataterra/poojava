package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        
        obj1.setNumero(123456);
        obj1.setNome("João");
        obj1.setIdade(26);
        obj1.setP1((float) 3.5);
        obj1.setP2(4);
        obj1.notaFinal();
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj1.notaFinal());
        JOptionPane.showMessageDialog(null, obj1.passou());
        
        Aluno obj2 = new Aluno();
        
        obj2.setNome("Lucas");
        obj2.setP1(9);
        obj2.setP2((float) 8.5);
        obj2.notaFinal();
        
        JOptionPane.showMessageDialog(null, obj2.toString());
        JOptionPane.showMessageDialog(null, obj2.notaFinal());
        JOptionPane.showMessageDialog(null, obj2.passou());
    }
}
