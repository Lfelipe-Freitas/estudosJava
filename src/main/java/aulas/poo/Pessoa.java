package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    //propriedades/atributos, no caso aqui, uma pessoa.
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    //construtor
   Pessoa() {
        //this representa o objeto

        this.nome = "Felipe";
        this.sobrenome = "Freitas";
        this.idade = 37;
        this.altura = 1.74;
        this.peso = 84;
    }
    // exemplo de construtor que de fato será usado
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //ações deuma pessoa

    void dizOla() {
        System.out.println("Olá tudo bem?");
    }

    double imc() {
       double imc = this.altura / (this.peso * this.peso);
        return imc;
    }

    void addPessoaNova(Pessoa pessoa) {
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa) {
       return this.conhecidos.contains(pessoa);
    }
}
