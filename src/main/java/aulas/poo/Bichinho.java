package aulas.poo;

import java.util.ArrayList;

public class Bichinho {
    String nome;
    double idade;
    double peso;
    ArrayList<Comida> bucho = new ArrayList<>();
    boolean estaDormindo = false;

    //construtores

    Bichinho(String nome, double idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //metodos

    void comer(Comida comida) {
        if(!this.bucho.contains(comida)) {
            this.peso += comida.calorias;
            this.bucho.add(comida);
        } else {
            System.out.println("O seu Bichinho ja comeu essa comida, escolha outra");
        }
    }

}
