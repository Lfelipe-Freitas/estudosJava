package Aulas;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {//LocalDate armazena qualquer data e o .now(), a data do dia em específico.
        LocalDate data = LocalDate.now();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        int dia = data.getDayOfMonth();
        LocalDate natal = LocalDate.of(22, 12, 25);
        int diasParaNatal = natal.getDayOfYear() - data.getDayOfYear(); //calcular quantos dias até o natal.

        System.out.println(diasParaNatal);

    }
}
