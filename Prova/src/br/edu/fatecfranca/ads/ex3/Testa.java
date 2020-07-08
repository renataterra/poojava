package br.edu.fatecfranca.ads.ex3;

public class Testa {

    public static void main(String[] args) {
        Desktop desk1 = new Desktop(45, "Dell");
        
        Notebook not1 = new Notebook(4400, "LG");
        
        LanHouse lan1 = new LanHouse();
        lan1.addVeiculo(desk1);
        lan1.addVeiculo(not1);
        
        System.out.println(lan1.toString());
    }
}
