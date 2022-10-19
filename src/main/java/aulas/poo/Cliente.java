package aulas.poo;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    //construtor
    Cliente (int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    //Getter - possibilita a leitura dos atributos private.

    String getNome() {
        return this.nome;
    }

    String getSobrenome() {
        return this.sobrenome;
    }

    String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    //Setter - Serve para alterar o valor de um atributo private.


    public void setAltura(double altura) {
        if (altura > 2.50 || altura < 0.50) {
            System.out.println("Altura inválida");
        } else {
            this.altura = altura;
        }
    }
}
