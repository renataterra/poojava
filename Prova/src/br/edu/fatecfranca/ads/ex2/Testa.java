package br.edu.fatecfranca.ads.ex2;

import java.util.Date;

public class Testa {
    
    public static void main(String[] args) {
        Remedio remedio1 = new Remedio("Cloroquina", "Bayer", (new Date("29/06/2021")));
        Remedio remedio2 = new Remedio("Omeprazol", "Bayer", (new Date("30/12/2021")));
        
        Farmacia farmacia1 = new Farmacia();
        farmacia1.setNome("Moderna");
        farmacia1.setCnpj("00.000.0000/00");
        farmacia1.addRemedio(remedio1);
        farmacia1.addRemedio(remedio2);
        
        farmacia1.addRemedio(remedio1);
        farmacia1.removeRemedio(remedio1);
        farmacia1.getRemedio(remedio2);
        farmacia1.updateRemedio(remedio1, remedio2);
        
        System.out.println(farmacia1.toString());
    }
    
}
