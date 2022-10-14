package Aulas;

import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        String nome = "Pedro";
        System.out.println("Digite seu sobrenome");
        Scanner leitor = new Scanner(System.in);
        String sobrenome = leitor.nextLine();

        if (sobrenome.equals("Pereira")) { //Por padrão o java compara posição na memória e não o conteúdo.
            System.out.println("São iguais"); //O .equals() deve ser utilizado para comparação.
        } else {
            System.out.println("São diferentes");
        }

        //outros métodos

        System.out.println(nome.substring(0, 1)); //variavel.substring(inicio, fim) serve para cortar a string.

        String valores = "13/10/2022";
        String[] arrValores = valores.split("/"); // resultado ["13", "10", "2022"]
    }
}
