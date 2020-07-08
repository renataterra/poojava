package br.edu.fatecfranca.ads.ex0;

public abstract class Funcionario {
    protected float salario;
    protected String nome;
    protected float horasTrabalho;
    protected float valorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, float horasTrabalho, float valorHora) {
        this.nome = nome;
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", nome=" + nome + ", horasTrabalho=" + horasTrabalho + ", valorHora=" + valorHora + '}';
    }
    
    public void calculaSalario() {
        this.setSalario(this.horasTrabalho * this.valorHora);
    }
}
