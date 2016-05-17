package com.visionarios.concurso.utils;

/**
 *
 * @author Visionarios
 */
public class ManejoStrings {
    public static String[] quitarEspacios(String entrada) {
        String salida[] = null;
        salida = entrada.split("\\h");
        return salida;
    }
}
