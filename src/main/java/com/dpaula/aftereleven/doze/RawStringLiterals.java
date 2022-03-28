package com.dpaula.aftereleven.doze;

/**
 * @author Fernando de Lima on 27/03/22
 */
public class RawStringLiterals {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        metodoIdent();
        metodoTransform();
    }

    /**
     * Método indent, que recebe um inteiro, e identa a string com espaços definididos pelo parametro
     */
    public static void metodoIdent() {

        String result = "Primeira linha\nE segunda identadas".indent(2);
        System.out.println(result);

    }

    /**
     * Método transform
     *
     * Que recebe uma função e retorna um objeto
     */
    public static void metodoTransform() {

        String result = "Fernando".transform(s -> s.concat(" de Lima"));

        System.out.println(result);

        result = result.transform(String::toUpperCase);

        System.out.println(result);
    }
}
