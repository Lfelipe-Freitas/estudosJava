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

        System.out.printf(user + " o seu IMC é = %.2f\n", imc); // %.2f mostra apenas 2 casas decimais.
        System.out.printf("O seu nome é %s e seu peso é %d", user, peso);
        // %s é string, %d é inteiros e %f é decimais..
    }
}
