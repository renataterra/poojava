package br.edu.fatecfranca.prova;

public class Teste {

    public static void main(String[] args) {
        Carro carro1 = new Carro(300, "SUV Creta", 2020);
        
        Moto moto1 = new Moto("guidão cromado", "Sport XL", 2020);
        
        Montadora mont1 = new Montadora();
        mont1.setCnpj("142582344546");
        mont1.setNome("Hyundai");
        mont1.addVeiculo(moto1);
        mont1.addVeiculo(carro1);
        
        System.out.println(mont1.toString());
    }
}
