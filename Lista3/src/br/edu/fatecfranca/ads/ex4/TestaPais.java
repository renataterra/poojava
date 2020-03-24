package br.edu.fatecfranca.ads.ex4;

import javax.swing.JOptionPane;

public class TestaPais {
    public static void main(String[] args) {
        Cidade cid1 = new Cidade("Franca", 100000);
        Cidade cid2 = new Cidade("Patrocínio Paulista", 25000);
        Cidade cid3 = new Cidade("Cássia", 10000);
        
        Estado estado1 = new Estado();
        estado1.setNome("São Paulo");
        estado1.setIniciais("SP");
        estado1.addCidade(cid1);
        estado1.addCidade(cid2);
        
        Estado estado2 = new Estado();
        estado2.setNome("Minas Gerais");
        estado2.setIniciais("MG");
        estado2.addCidade(cid3);
        
        Pais pais = new Pais();
        pais.setContinente("Brasil");
        pais.setIniciais("BR");
        pais.addEstado(estado1);
        pais.addEstado(estado2);

        JOptionPane.showMessageDialog(null, estado1.toString());
        JOptionPane.showMessageDialog(null, estado2.toString());
        JOptionPane.showMessageDialog(null, pais.toString());
    }
}
