package br.edu.fatecfranca.ads.trabalho;

import java.util.Date;

public abstract class Acao {
    protected String quantidade;
    protected String horario;
    protected boolean confirmar;
    protected boolean acao;
    
    public Acao() {
    }

    public Acao(String quantidade, String horario, boolean confirmar) {
        this.quantidade = quantidade;
        this.horario = horario;
        this.confirmar = confirmar;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isConfirmar() {
        return confirmar;
    }

    public void setConfimar(boolean confirmar) {
        this.confirmar = confirmar;
    }

    public boolean isAcao() {
        return acao;
    }

     void setAcao(boolean acao) {
        this.acao = acao;
    }

    @Override
    public String toString() {
        return "Agenda{" + "quantidade=" + quantidade + ", horario=" + horario + ", confirmar=" + confirmar + ", acao=" + acao + '}';
    }
    
    public void confirmaAcao() {
        if (this.confirmar = true) {
            this.acao = true;
        } else {
            this.acao = false;
        }
    }
}
