package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public class DarAgua extends Acao{

    public DarAgua() {
        super();
    }

    public DarAgua(String quantidade, String horario, boolean confirmar) {
        super(quantidade, horario, confirmar);
    }
    
    @Override
    public String toString() {
        return "Agua{" + super.toString() +'}';
    }
}
