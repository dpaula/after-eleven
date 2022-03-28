package com.dpaula.aftereleven.doze;

/**
 * @author Fernando de Lima on 27/03/22
 */
public class SwitchNovo {

    private enum DIA_DA_SEMANA {SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA , SABADO, DOMINGO}

    public static void main(String[] args) {

        System.out.println(switchVelho(DIA_DA_SEMANA.DOMINGO));
        System.out.println(switchNovo(DIA_DA_SEMANA.SEGUNDA));

    }

    private static String switchVelho(DIA_DA_SEMANA dia) {

        String resultado = null;

        switch (dia) {

            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                resultado = "Dia útil!";
                break;
            case SABADO:
            case DOMINGO:
                resultado = "Final de semana!";
                break;
            default:
                resultado = "Dia inválido!";
        }

        return resultado;
    }

    public static String switchNovo(DIA_DA_SEMANA dia) {

        return switch (dia) {
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia útil!";
            case SABADO, DOMINGO -> "Final de semana!";
        };
    }
}
