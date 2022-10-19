package aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    private double peso;
//construtor
    public Pet (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
//métodos
    void fazerSom() {
        System.out.println("...");
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida + "!");
    }

    void dormir() {
        System.out.println("ZZZZzzzZZ");
    }

    void brincar(String brincadeira) {
        System.out.println("Estou brincando de " + brincadeira);
    }
// Getters e Setters
    double getPeso() {
        return this.peso;
    }

    void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
