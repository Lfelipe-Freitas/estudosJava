package aulas.poo.escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe","lfelipe.dfreitas@gmail.com", "000.000.000-05", 10);

        aluno1.seApresentar();

        Professor professor1 = new Professor("Almir", "almir@almir.com.br", "000.000.000-00", "TI");

        professor1.seApresentar();

        Pessoa pessoa1 = new Pessoa("Carla", "carla@carla.com.br", "000.000.000-02");

        pessoa1.seApresentar();
    }
}
