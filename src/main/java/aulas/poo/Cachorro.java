package aulas.poo;

public class Cachorro extends Pet{
    String comidaFavorita;

    String raca;

    Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        super(nome, idade, peso); //Chamando o construtor da Super Classe (Pet)
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override
    void fazerSom() {
        System.out.println("au au au au");
    }

    @Override
    void comer(String comida) {
        if (comida.equals(this.comidaFavorita)) {
            System.out.println("O cachorro come com felicidade!");
        } else {
            System.out.println("O cachorro rosna ferozmente e rejeita a comida");
        }
    }

    public static void main(String[] args) {

        Pet generico = new Pet("noname",1, 2.0);
    //A classe cachorro herdou as propriedades do pet.
        Cachorro jack = new Cachorro("Jack",1, 2.0, "lazanha", "golden");
    //A classe cachorro herdou tb todos os métodos da classe pet
        jack.brincar("pega-pega");
        jack.comer("lazanha");
        jack.dormir();
        jack.setPeso(15);
        jack.fazerSom();
        jack.comer("lazanha");
    }
}
