package br.edu.fatecfranca.ads.ex0;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Conta objParte = new Conta();
        objParte.setAgencia("5678");
        objParte.setNome("Pedro");
        objParte.setNro("123-4");
        objParte.setSaldo(3000);
        
        Cartao objTodo = new Cartao();
        objTodo.setBandeira("Master");
        objTodo.setCvv(555);
        objTodo.setNro("1111111111111111");
        objTodo.setValidade("10/22");
        objTodo.setSenha("45687");
        // associação de agregação
        objTodo.setConta(objParte);
        
        JOptionPane.showMessageDialog(null, objTodo.toString());
        JOptionPane.showMessageDialog(null, ((objTodo.sacar(30, "45687")) ? 
                "Sacou" : "Não sacou"));
    }
}
