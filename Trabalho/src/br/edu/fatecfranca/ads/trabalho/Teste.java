package br.edu.fatecfranca.ads.trabalho;

public class Teste {
    public static void confirmaAcao(Agenda agenda) {
        agenda.confirmaAcao();
        System.out.println(agenda.toString());
    }
    
    public static void main(String[] args) {
        
        Alimentacao alimentacao1 = new Alimentacao("Isosource", "200ml", "8h00", true);
        confirmaAcao(alimentacao1);
        
        Agua agua1 = new Agua("150ml", "9h30", true);
        confirmaAcao(agua1);
        
        Medicacao medicacao1 = new Medicacao("Losartana", "1c comprimido", "10h00", false);
        confirmaAcao(medicacao1);
        
        Idoso idoso1 = new Idoso();
        idoso1.setNome("José");
        idoso1.setDataNasc("01/05/1925");
        idoso1.setCPF("555.555.555-55");
        idoso1.setRG("11.111.111-1");
        idoso1.setEndereco("Rua do Limoeiro, nº 5, Parque das Oliveiras");
        idoso1.setEstadoCivil("Viúvo");
        idoso1.setAltura((float) 1.68);
        idoso1.setPeso((float) 98.5);
        idoso1.setTelefone("5555-5555");
        idoso1.setEnfermidades("Diabetes");
        idoso1.setAlergiaMedicamentos("Diclofenaco");
        idoso1.addAgenda(agua1);
        idoso1.addAgenda(alimentacao1);
        idoso1.addAgenda(medicacao1);
    }
}
