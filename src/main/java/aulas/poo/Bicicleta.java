package aulas.poo;

public class Bicicleta {
   private int marcha;
   private int velocidade;

   Bicicleta(int marcha, int velocidade) {
       this.marcha = marcha;
       this.velocidade = velocidade;
   }

   @Override
   public String toString() {
       return "Bicicleta(Marcha=" + this.marcha + ", " + "Velocidade=" + this.velocidade + ")";
   }
    public static void main(String[] args) {
        Bicicleta monark = new Bicicleta(6, 40);

        System.out.println(monark);
    }
}
