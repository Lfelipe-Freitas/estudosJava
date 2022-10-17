package aulas.poo;
// intuito: testar o uso da classe pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Felipe";
        pessoa1.sobrenome = "Freitas";
        pessoa1.idade = 37;
        pessoa1.peso = 84;
        pessoa1.altura = 1.74;

        pessoa1.dizOla();

        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        double imcPessoa2 = pessoa2.imc();
        System.out.println(imcPessoa2);
    }


}
