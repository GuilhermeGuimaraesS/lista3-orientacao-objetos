package questoes.src.questao03.util;

import java.time.LocalDate;

public class VerificarValidade {

    public static LocalDate dataDeHoje = LocalDate.now();

    public static boolean compararData(LocalDate dataDeVencimento){

        boolean antes = dataDeVencimento.isBefore(dataDeHoje);
        boolean igual = dataDeVencimento.isEqual(dataDeHoje);
        boolean depois = dataDeVencimento.isAfter(dataDeHoje);

        return (antes || igual) ? false : true;

    }

}
