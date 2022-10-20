package aulas.poo.zoo;

import java.util.ArrayList;

//na interface se define um conjunto de métodos e a classe que herda deve implementar esses métodos.
//esses métodos não precisam de corpo "{}"
//colocamos a definição do método, apenas.
public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{
    @Override
    public void dormir() {
        System.out.println("ZzZzZz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")) {
            System.out.println("Miau-ravilha");
        } else {
            System.out.println("Só como peixe");
        }
    }

}

class Galinha implements Animal {

    @Override
    public void dormir() {
        System.out.println("có có ZzzZZzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("có có có cóoooo");
    }

    @Override
    public void comer(String comida) {
        System.out.println("A galinha come qualquer coisa, até outras galinhas!");
    }

    public static void main(String[] args) {
        Galinha galinha1 = new Galinha();
        Gato gato1 = new Gato();

        ArrayList<Animal> fazenda = new ArrayList();
        fazenda.add(galinha1);
        fazenda.add(gato1);

        for(Animal animais : fazenda) {
            animais.comer("Peixe");
            animais.dormir();
            animais.fazerSom();

        }

        System.out.println(fazenda.size());
    }
}


