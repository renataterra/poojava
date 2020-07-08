package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public class Agua extends Agenda{

    public Agua() {
        super();
    }

    public Agua(String quantidade, String horario, boolean confirmar) {
        super(quantidade, horario, confirmar);
    }
    
    @Override
    public String toString() {
        return "Agua{" + super.toString() +'}';
    }
}
