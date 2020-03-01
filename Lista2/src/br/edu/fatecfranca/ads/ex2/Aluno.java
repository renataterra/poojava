package br.edu.fatecfranca.ads.ex2;

/* UML
- numeroAluno: Integer
- nome: String
- idade: Integer
- p1: float
- p2: float
+ notaFinal(): void
*/

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    //Métodos construtores
    public Aluno() {
        this.numeroAluno = 0;
        this.nome = "ainda não informado";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumero(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    //setters
    public void setNumero(int numeroAluno) {
        if (Integer.toString(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Número menor que 6 elementos!");
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
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
        else {
            System.out.println("Idade não pode ser negativa");
        }
    }
    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        }
        else {
            System.out.println("Nota 1 não pode ser negativo");
        }
    }
    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        }
        else {
            System.out.println("Nota 2 não pode ser negativo");
        }
    }
    
    //getters
    public int getNumero() {
        return this.numeroAluno;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public float getP1() {
        return this.p1;
    }
    public float getP2() {
        return this.p2;
    }
    
    //Métodos
    public String notaFinal() {
        return "Nota final do aluno " + (this.nome) + (": ") + ((this.p1 + this.p2) / 2);
    }
    public String passou() {
        if (((this.p1 + this.p2) / 2) >= 6) {
            return "Parabéns, você passou!!";
        }
        else{
            return "Você não passou!";
        }
    }
    public String toString() {
        return  "Número do aluno: " + this.numeroAluno +
                "\n Nome do aluno: " + this.nome +
                "\n Idade do aluno: " + this.idade;
    }
}

