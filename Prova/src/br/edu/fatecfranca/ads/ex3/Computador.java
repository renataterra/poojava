package br.edu.fatecfranca.ads.ex3;
// Resposta letra E)
// O polimorfismo foi usado quando criamos classe mãe e filhas
// e referenciamos elas pelo super().
// Dessa forma, se eu inserir um desktopo ou um notebook,
// todos são inseridos em computadores, mesmo que tenham comportamentos distintos.
public class Computador {
    protected String descrição;

    public Computador() {
    }

    public Computador(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "Computador{" + "descri\u00e7\u00e3o=" + descrição + '}';
    }
}
