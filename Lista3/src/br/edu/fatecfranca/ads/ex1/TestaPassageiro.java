package br.edu.fatecfranca.ads.ex1;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiro {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Pedro");
        passageiro.setCpf("123456789-1");

        Voo voo = new Voo();
        voo.setNro("12");
        voo.setDestino("São Paulo");
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);
        
        Reserva objTodo = new Reserva();
        objTodo.setCodigo(12345);
        objTodo.setData(new Date(c.getTimeInMillis()));
        
        objTodo.setPassageiro(passageiro);
        objTodo.setVoo(voo);
        
        JOptionPane.showMessageDialog(null, objTodo.toString());
    }
}
