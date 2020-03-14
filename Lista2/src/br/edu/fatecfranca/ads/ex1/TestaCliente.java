package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        
        obj1.setNome("Fulano");
        obj1.setAgencia("5555-9");
        obj1.realizarDeposito(100);
        obj1.realizarSaque(50);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        
        Cliente obj2 = new Cliente();
        
        obj2.setNome("Beltrano");
        obj2.setConta("555555-9");
        obj2.setSaldo(1000);
        obj2.realizarDeposito(80);
        obj2.realizarSaque(20);
        
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
}
