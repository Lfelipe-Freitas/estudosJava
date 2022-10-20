package aulas.poo.escola;

public class Aluno extends Pessoa{
    double media;

    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); //sempre deve ser a primeira linha quando houver a herança
        this.media = media;
    }

    @Override
    void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou um aluno com média " + this.media + "!");
    }

    public double getMedia() {
        return this.media;
    }
}


