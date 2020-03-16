package br.edu.fatecfranca.ads.ex3;

import javax.swing.JOptionPane;

public class TestaRodoviaria {

    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("490963001", "Carla");
        Passageiro pas2 = new Passageiro("490963008", "Romeu");
        Passageiro pas3 = new Passageiro("490963075", "João");
        
        Onibus onibus1 = new Onibus();
        onibus1.setNumero(1);
        onibus1.setPlaca("HBS1234");
        onibus1.addPassageiro(pas1);
        
        Onibus onibus2 = new Onibus();
        onibus2.setNumero(2);
        onibus2.setPlaca("SGR9101");
        onibus2.addPassageiro(pas2);
        onibus2.addPassageiro(pas3);
        
        Rodoviaria rod = new Rodoviaria();
        rod.setNome("Tietê");
        rod.setCidade("São Paulo");
        rod.addOnibus(onibus1);
        rod.addOnibus(onibus2);

        JOptionPane.showMessageDialog(null, onibus1.toString());
        JOptionPane.showMessageDialog(null, onibus2.toString());
        JOptionPane.showMessageDialog(null, rod.toString());
    }
}
