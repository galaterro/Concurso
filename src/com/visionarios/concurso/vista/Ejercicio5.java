package com.visionarios.concurso.vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Visionarios
 */
public class Ejercicio5 {

    public Ejercicio5() {
        ArrayList<Integer> alNumeros = new ArrayList<Integer>();
        int numero = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los para conocer si son REVERSIBLES");

        while (numero != 0) {
            numero = sc.nextInt();
            if (numero != 0) {
                alNumeros.add(numero);
            }
        }

        for (Integer n : alNumeros) {
            if (n > 9 && n % 10 != 0 && sonTodosImpar(n, invertirNumero(n))) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }

    public int contarLongitud(int num) {
        int resultado = 1;

        while (num / 10 != 0) {
            num = num / 10;
            resultado++;
        }
        return resultado;
    }

    public int invertirNumero(int num) {
        int resultado = 0;

        for (int i = contarLongitud(num); i > 0; i--) {
            resultado = resultado + (num % 10) * ((exponente(10, i - 1)));
            num = num / 10;
        }
        return resultado;
    }

    public int exponente(int base, int exp) {
        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    public Boolean sonTodosImpar(int numero, int reverso) {
        int resultado = numero + reverso;
        Boolean sonTodosImpares = true;
        for (int i = 0; i < contarLongitud(resultado); i++) {

            if (resultado % 2 == 0) {
                sonTodosImpares = false;
                return sonTodosImpares;
            }
            resultado = resultado / 10;
        }

        return sonTodosImpares;
    }
}
