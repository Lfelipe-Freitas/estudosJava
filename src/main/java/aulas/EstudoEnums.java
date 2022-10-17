package aulas;

public class EstudoEnums {
    public static void main(String[] args) {
        enum diasDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        diasDaSemana hoje = diasDaSemana.QUINTA;
    }
}
