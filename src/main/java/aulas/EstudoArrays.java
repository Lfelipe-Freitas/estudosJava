package aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String args[]) {
        //int[] numeros = {1, 2, 3, 4, 5}; primeira forma de representação
        //int[] numeros = new int[1, 2, 3, 4, 5]; segunda forma
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas notas você vai inserir?");
        int entrada = leitor.nextInt();
        double[] arrNotas = new double[entrada];

        for(int i = 0; i < arrNotas.length; i++) {
            System.out.println("Digita a nota " + (i+1) + ":");
            arrNotas[i] = leitor.nextDouble();
        }
        double soma = 0.0;
        for(double nota : arrNotas) {
            soma += nota;
        }
        double media = soma / entrada;

        System.out.printf("Sua média é %.2f\n", media);

        //condição ternária

        String mensagem = (media < 7) ? "Você está reprovado" : "Você está aprovado";

        System.out.println(mensagem);
    }
}
