import java.util.Scanner;

public class Exercicio001 {


    public static void main (String args[]) {
        System.out.println("Digite um número de 1 a 4 para selecionar sua operação:");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        Scanner leitor = new Scanner(System.in);
        int operacao = leitor.nextInt();

        //Estrutura de escolha

        switch (operacao) {
            case 1:
                System.out.println("Digite o primeiro número para a soma");
                int s1 = leitor.nextInt();
                System.out.println("Digite o segundo número para a soma");
                int s2 = leitor.nextInt();
                int sTotal = s1 + s2;
                System.out.println("o resultado de sua adição é " + sTotal);
                break;

            case 2:
                System.out.println("Digite o primeiro número para a subtração");
                int sb1 = leitor.nextInt();
                System.out.println("Digite o segundo número para a subtração");
                int sb2 = leitor.nextInt();
                int sbTotal = sb1 - sb2;
                System.out.println("o resultado de sua adição é " + sbTotal);
                break;

            case 3:
                System.out.println("Digite o primeiro número para a Multiplicação");
                int m1 = leitor.nextInt();
                System.out.println("Digite o segundo número para a Multiplicação");
                int m2 = leitor.nextInt();
                int mTotal = m1 * m2;
                System.out.println("o resultado de sua multiplicação é " + mTotal);
                break;

            case 4:
                System.out.println("Digite o primeiro número para a Divisão");
                double d1 = leitor.nextDouble();
                System.out.println("Digite o segundo número para a Divisão");
                double d2 = leitor.nextDouble();
                double dTotal = d1 / d2;
                System.out.println("o resultado de sua divisão é " + dTotal);
        }
    }
}
