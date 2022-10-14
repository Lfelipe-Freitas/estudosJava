package Aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //ArrayList não funciona com primitivos

        //Adicionando elementos na ArrayList

        numeros.add(10); //o .add se equivale ao push no js, esse método só coloca um elemento por vez.
        numeros.add(20);
        numeros.set(1, 500); //O método .set serve para substituir elementos de um ArrayList .set(index, valor)
        //numeros.remove(index); remove um elemento do ArrayList, tornado-o menor.
        numeros.size(); //Se equivale ao .length do js.
        System.out.println(numeros.get(0)); //ele equivale ao numeros[0] no js.

        for(int i = 0; i < numeros.size(); i++) { //exemplo de for para printar com .get usando o for
            System.out.println(numeros.get(i));
        }

        for(int batata : numeros) {
            System.out.println(numeros); //for sem usar o "i"
        }
    }
}
