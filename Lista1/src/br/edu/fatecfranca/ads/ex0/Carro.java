package br.edu.fatecfranca.ads.ex0;

/* UML
- modelo: string
- marca: string
- motor: boolean
- velAtual: float
+ ligar(): void
+ desligar(): void
+ acelerar(float): void
+ frear(float): void
+ toString(): string
*/

public class Carro {
    // variáveis
    private String modelo, marca;
    private boolean motor;
    private float velAtual;
    
    //método construtor
    public Carro (String modelo, String marca, boolean motor, float velAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    // métodos
    public void ligar() {
        this.motor = true;
    }
    public void desligar() {
        this.motor = false;
    }
    public void acelerar(float x) {
        this.velAtual = this.velAtual + x;
    }
    public void frear(float x) {
        this.velAtual = this.velAtual - x;
    }
    
    public String toString() {
        return "Modelo: " + this.modelo +
                "\n Marca: " + this.marca +
                "\n Motor: " + this.motor +
                "\n Vel atual: " + this.velAtual;
    }
}
