package aulas.poo;

import java.time.LocalDate;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(01,"Felipe", "Freitas", LocalDate.of(1985, 9,
                23), 1.71, 84.0);

        cliente1.setAltura(10);
    }
}
