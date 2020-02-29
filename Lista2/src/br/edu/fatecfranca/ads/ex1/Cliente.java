package br.edu.fatecfranca.ads.ex1;

public class Cliente {
/* UML
- numeroConta: String
- numeroAgencia: String
- nome: String
- saldo: float
+ realizarDeposito(): void
+ realizarSaque(): void
*/

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    //Métodos construtores
    public Cliente () {
        this.numeroConta = "ainda não definido";
        this.numeroAgencia = "ainda não definido";
        this.nome = "ainda não definido";
        this.saldo = 0;
    }
    
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setConta(numeroConta);
        this.setAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    //setters
    public void setConta(String numeroConta) {
        if (numeroConta.length() == 8 && (numeroConta.charAt(6) == ('-'))){
            this.numeroConta = numeroConta;
        }
    else {
            System.out.println("Conta Incorreta");
        }
    }
    public void setAgencia(String numeroAgencia) {
       if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == ('-')){
            this.numeroAgencia = numeroAgencia;
        }
    else {
            System.out.println("Agência Incorreta");
        }
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
    else {
            System.out.println("Nome deve conter até 30 caracteres");
        }
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo não pode ser negativo");
        }
    }
    
    //getters
    public String getConta() {
        return this.numeroConta;
    }
    public String getAgencia() {
        return this.numeroAgencia;
    }
    public String getNome() {
        return this.nome;
    }
    public float getSaldo() {
        return this.saldo;
    }
    
    //Métodos
    public void realizarDeposito(float x) {
        this.setSaldo(this.saldo + x);
    }
    public void realizarSaque(float x) {
        this.setSaldo(this.saldo - x);
    }
    
    public String toString() {
        return  "Número da conta: " + this.numeroConta +
                "\n Número da agência: " + this.numeroAgencia +
                "\n Nome do cliente: " + this.nome +
                "\n Saldo atual: " + this.saldo;
    }  
}

