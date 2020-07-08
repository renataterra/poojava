package br.edu.fatecfranca.ads.trabalho;

public class Teste {
    public static void confirmaAcao(Acao acao) {
        acao.confirmaAcao();
        System.out.println(acao.toString());
    }
    
    public static void main(String[] args) {
        
        DarAlimentacao alimentacao1 = new DarAlimentacao("Isosource", "200ml", "8h00", true);
        confirmaAcao(alimentacao1);
        
        DarAgua agua1 = new DarAgua("150ml", "9h30", true);
        confirmaAcao(agua1);
        
        DarMedicacao medicacao1 = new DarMedicacao("Losartana", "1c comprimido", "10h00", false);
        confirmaAcao(medicacao1);
        
        Cuidador cuidador1 = new Cuidador();
        cuidador1.setNome("José");
        cuidador1.setDataNasc("01/05/1925");
        cuidador1.setCPF("555.555.555-55");
        cuidador1.setRG("11.111.111-1");
        cuidador1.setEndereco("Rua do Limoeiro, nº 5, Parque das Oliveiras");
        cuidador1.setEstadoCivil("Viúvo");
        cuidador1.setTelefone("5555-5555");
        cuidador1.addAcao(agua1);
        cuidador1.addAcao(alimentacao1);
        cuidador1.addAcao(medicacao1);
        cuidador1.removeAcao(alimentacao1);
        
        System.out.println(cuidador1.toString());
    }
}
