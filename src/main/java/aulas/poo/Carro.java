package aulas.poo;

public class Carro { //classe
    String modelo;

    String marca;

    int ano;

    boolean eflex;

    int qtPorta;

    double combustivelAtual;

    double consumo;

    boolean estaLigado;

    // construtor
    Carro(String modelo, String marca, int ano, boolean eflex, int qtPorta, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.eflex = eflex;
        this.qtPorta = qtPorta;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
        this.estaLigado = false;

    }
//Abastecer
    void abastecer(double total) {
        this.combustivelAtual += total;
    }
//Ligar
    void ligar() {
        this.estaLigado = true;
    }
//Desligar
    void desligar() {
        this.estaLigado = false;
    }
//Viajar
    boolean viajar(String local, double distancia) {
        if (!this.estaLigado) {
            this.ligar();
        }
        double totalLitros = distancia / this.consumo;

        if (this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivelAtual + "L");
            return true;
        } else {
            System.out.println("A viagem para " + local + " não aconteceu.");
            return false;
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Onyx", "GM", 2015, true, 4,  16);
        boolean trip = carro1.viajar("Gramado", 100);
    }
}


