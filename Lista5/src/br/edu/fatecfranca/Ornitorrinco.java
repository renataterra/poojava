package br.edu.fatecfranca;

public class Ornitorrinco implements Ave, Mamifero {
    @Override
    public String porOvos() {
        return "Ornitorrinco pondo ovos";
    }
    @Override
    public String darMama() {
        return "Ornitorrinco dando de mamá";
    }
}
