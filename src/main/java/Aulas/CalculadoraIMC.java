package Aulas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String user = entrada.nextLine();

        System.out.println("Qual o seu peso?");
        int peso = entrada.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura); // peso / Math.pow(altura, 2)

        if (imc < 17) {
            System.out.println("Você está MUITO abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Você está com o peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Você está acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Você está com obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Você está com obesidade II (sevéra)");
        } else {
            System.out.println("Você está com OBESIDADE MÓRBIDA");
        }
        // System.out.printf(user + " o seu IMC é = %.2f\n", imc); // %.2f mostra apenas 2 casas decimais.
        //System.out.printf("O seu nome é %s e seu peso é %d", user, peso);
        // %s é string, %d é inteiros e %f é decimais..

        //switch case

        System.out.println("Selecione a sua dieta");
        System.out.println("1 - Dieta da água");
        System.out.println("2 - Dieta da Fruta");
        System.out.println("3 - Dieta da Batata");

        int dieta = entrada.nextInt();

        switch(dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da Água");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da Fruta");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da Batata");
                break;
            default:
                System.out.println("Dieta inválida");
        }

        //for no java
        System.out.println("Digite o nome de 3 alimentos");
        String[] arr = new String[4];
        arr[0] = entrada.nextLine();
        arr[1] = entrada.nextLine();
        arr[2] = entrada.nextLine();
        arr[3] = entrada.nextLine();
        System.out.println(arr[1] + "\n" + arr[2] + "\n" + arr[3]);
    }
}
