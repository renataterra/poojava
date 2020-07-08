package br.edu.fatecfranca.ads.ex0;

public class Teste {
    public static void calculaSalarioMostra(Funcionario camaleao) {
        camaleao.calculaSalario();
        System.out.println(camaleao.toString());
    }
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente(3000, "Carlos", 40, 50);
        calculaSalarioMostra(gerente1);
        
        Diretor diretor1 = new Diretor(5000, "Civic", "Marcos", 40, 70);
        calculaSalarioMostra(diretor1);
        
        Departamento depto1 = new Departamento();
        depto1.setNome("Tecnologia");
        depto1.setSetor("Software");
        depto1.addFuncionario(diretor1);
        depto1.addFuncionario(gerente1);
        
        System.out.println(depto1.toString());
    }
}