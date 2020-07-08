package br.edu.fatecfranca.ads.ex4;

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
        
        System.out.println(estado1.toString());
        
        Pais pais1 = new Pais();
        pais1.setContinente("América do Sul");
        pais1.setIniciais("BR");
        pais1.setNome("Brasil");
        
        pais1.addEstado(estado2);
        
        Cidade cidade4 = new Cidade("Ibiraci", 17000);
        pais1.addCidadeEstado(cidade4, estado2);
        
        System.out.println(pais1.toString());
        
    }
}
